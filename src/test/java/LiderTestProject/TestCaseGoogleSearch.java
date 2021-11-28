package LiderTestProject;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import projectLiderTest.pagesYandexGoogle.*;
import static projectLiderTest.pagesYandexGoogle.BaseViewLiderTest.BASE_URL_Google;

@Feature("Тестовое задание для Лидер тестирования: три тест кейса - первый на вход в почтовый ящик на www.yandex.ru;" +
        " второй - на гугл поиск, в поисковую строку вводятся слова\n" +
        "«купить кофемашину bork c804», результатов больше 10 и в выдаче\n" +
        "присутствует mvideo.ru; третий - зайди на https://reqres.in и напиши автотест на тестирование эндпоинта\n" +
        "[GET] SINGLE USER (https://reqres.in/api/single_user).\n" +
        "Должна осуществляться проверка, что сервер возвращает статус 200 и\n" +
        "first_name = “Janet”\n" +
        "(опционально)  ")

public class TestCaseGoogleSearch extends BaseTestGeneral {

    @BeforeEach
    @Step("Переход на страницу Гугл по URL")
    public void goToPage() {
        driver.get(BASE_URL_Google);
    }

    @Test
    @Description("Тест №2 Гугл-поиск")
        //тест-кейс 1 В поисковую строку вводятся слова
        //«купить кофемашину bork c804», результатов больше 10 и в выдаче
        //присутствует mvideo.ru.
    void searchGoogle() throws InterruptedException {
        new InputWordSearchGoogle(driver)
                .fillDescription("купить кофемашину bork c804")
                .clickIconGoogle.click();
        new InputWordSearchGoogle(driver)
                .clickGoogleButton.click();
        Thread.sleep(5000);

    }
}


