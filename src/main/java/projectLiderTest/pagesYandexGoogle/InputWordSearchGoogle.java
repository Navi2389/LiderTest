package projectLiderTest.pagesYandexGoogle;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Feature("В поисковую строку вводим слова")
public class InputWordSearchGoogle extends BaseViewLiderTest {

    public InputWordSearchGoogle(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "q")
    public WebElement requestDescription;

    @Step("Прописываем в строке поиска Гугл «купить кофемашину bork c804»")
    public InputWordSearchGoogle fillDescription(String description) throws InterruptedException {
        requestDescription.sendKeys(description);

        return this;
    }

    //кликаем по иконке "Google"
    @FindBy(xpath = "/html/body/div[1]/div[2]/div/img")
    public WebElement clickIconGoogle;

    //кликаем по кнопке "Поиск в Google" на странице
    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")
    public WebElement clickGoogleButton;

    //Проверяем наличие слова "результат" на итоговой странице
    @FindBy(xpath = "//*[@id=\"result-stats\"]/text()")
    public WebElement requestSuccess;


}



