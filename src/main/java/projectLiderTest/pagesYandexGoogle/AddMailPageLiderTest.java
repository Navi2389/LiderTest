package projectLiderTest.pagesYandexGoogle;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddMailPageLiderTest extends BaseViewLiderTest {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/form/div[3]/button/span")
    public WebElement buttonSubmitNotNow;

    public AddMailPageLiderTest(WebDriver driver) {
        super(driver);
    }

    @Step("Нажимаем кнопку не сейчас при добавлении почтового ящика")
    public MainPageLiderTest submitNotNow() {
        buttonSubmitNotNow.click();
        return new MainPageLiderTest(driver);
    }

    public MainPageLiderTest notnow(String empty) {
        buttonSubmitNotNow.click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(new MainPageLiderTest(driver).yandexPageAccountButtonLocator));
        return new MainPageLiderTest(driver);
    }
}
