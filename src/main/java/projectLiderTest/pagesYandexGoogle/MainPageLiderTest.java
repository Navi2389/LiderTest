package projectLiderTest.pagesYandexGoogle;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageLiderTest extends BaseViewLiderTest {
    public NavigationMenuLiderTest navigationMenu;

    public MainPageLiderTest(WebDriver driver) {
        super(driver);
        navigationMenu = new NavigationMenuLiderTest(driver);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/h1/span")
    public WebElement yandexNextPageButton;

    public By yandexNextPageButtonLocator = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/h1/span");

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/h1/text()")
    public WebElement yandexNextPageMailButton;

    public By yandexNextPageMailButtonLocator = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[2]/div[3]/div/div/h1/span");

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[2]/nav/ul/li[1]/a/span")
    public WebElement yandexPageAccountButton;

    public By yandexPageAccountButtonLocator = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/nav/ul/li[1]/a/span");

}



