package projectLiderTest.pagesYandexGoogle;


import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PasswordPageLiderTest extends BaseViewLiderTest {

    @FindBy(id = "passp-field-passwd") //исправили
    public WebElement inputPassword;

    @FindBy(id = "passp:sign-in") //исправили
    public WebElement buttonSubmitPassword;

    public PasswordPageLiderTest(WebDriver driver) {
        super(driver);
    }

    @Step("Заполняем поле пароль при авторизации")
    public PasswordPageLiderTest fillInputPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    @Step("Нажимаем кнопку войти на странице авторизации пароля")
    public MainPageLiderTest submitPassword() {
        buttonSubmitPassword.click();
        return new MainPageLiderTest(driver);
    }

    public MainPageLiderTest Password(String password) {
        inputPassword.sendKeys(password);
        buttonSubmitPassword.click();
       webDriverWait.until(ExpectedConditions.presenceOfElementLocated(new MainPageLiderTest(driver).yandexNextPageMailButtonLocator));
      //  webDriverWait.until(ExpectedConditions.presenceOfElementLocated(new MainPageLiderTest(driver).yandexPageAccountButtonLocator));
        return new MainPageLiderTest(driver);
    }
}
