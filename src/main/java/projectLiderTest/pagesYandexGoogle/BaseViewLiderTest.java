package projectLiderTest.pagesYandexGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseViewLiderTest {
    public WebDriver driver; //экземпляр драйвера с спомощью которого мы будем взаимодействовать с конкретной страницей
    public WebDriverWait webDriverWait;
    LoginPageLiderTest LoginPageLiderTest;
    public static final String BASE_URL_Yandex = "https://passport.yandex.ru/auth/";
    public static final String BASE_URL_Google = "https://www.google.ru/";

    public BaseViewLiderTest(WebDriver driver) {
        this.driver = driver;
        webDriverWait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);//будет скрывать и за нас писать код driver.findElement(By...) //позволит нам сократить запись
    }
}
