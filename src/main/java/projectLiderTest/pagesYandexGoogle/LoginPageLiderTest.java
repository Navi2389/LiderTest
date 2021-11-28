package projectLiderTest.pagesYandexGoogle;


import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPageLiderTest extends BaseViewLiderTest {
    @FindBy(id = "passp-field-login") //исправили
    public WebElement inputLogin;

    @FindBy(id = "passp:sign-in") //исправили
    public WebElement buttonSubmitLogin;

    public LoginPageLiderTest(WebDriver driver) {
        super(driver);
    }

    @Step("Заполняем поле логин при авторизации")
    public LoginPageLiderTest fillInputLogin(String login) {
        inputLogin.sendKeys(login);
        return this;
    }

    @Step("Нажимаем кнопку войти на странице авторизации логина")
    public MainPageLiderTest submitLogin() {
        buttonSubmitLogin.click();
        return new MainPageLiderTest(driver);
    }

    public MainPageLiderTest login(String login) {
        inputLogin.sendKeys(login);
        buttonSubmitLogin.click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(new MainPageLiderTest(driver).yandexNextPageButtonLocator));
        return new MainPageLiderTest(driver);
    }
}
