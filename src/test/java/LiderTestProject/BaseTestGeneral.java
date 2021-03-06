package LiderTestProject;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import projectLiderTest.pagesYandexGoogle.LoginPageLiderTest;


import java.util.List;

public class BaseTestGeneral {
    EventFiringWebDriver driver;
    WebDriverWait webDriverWait;
    LoginPageLiderTest loginPageProject6;


    @BeforeAll //перед всеми тестами
    static void beforeAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach //перед каждым тестом
    public void setupBrowser() {
        driver=new EventFiringWebDriver(new ChromeDriver());
        webDriverWait = new WebDriverWait(driver, 10);
        loginPageProject6 = new LoginPageLiderTest(driver);

    }

    @AfterEach
    @Step("Сбор информаци по логам в браузер и закрытие браузера")
    void tearDown() {
        //мы будем выводить в лог всю информацию, которая попадада в консоль браузера после каждого теста
        List<LogEntry> logs=driver.manage().logs().get(LogType.BROWSER).getAll();
        driver.manage().logs().get(LogType.BROWSER).getAll().forEach(System.out::println);
        //закрываем браузер
        driver.quit();
    }
}
