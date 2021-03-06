package projectLiderTest.pagesYandexGoogle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NavigationMenuLiderTest extends BaseViewLiderTest {

    public NavigationMenuLiderTest(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[@class='nav nav-multilevel main-menu']/li")
    public List<WebElement> navigationMenuItems;

    public void openNavigationMenuItem(String menuName) {
        Actions actions = new Actions(driver);//будем наводить мышь на элемент меню
        actions.moveToElement(
                navigationMenuItems.stream().filter(element -> element.getText().equals(menuName)).findFirst().get())
                .perform();
    }
}
