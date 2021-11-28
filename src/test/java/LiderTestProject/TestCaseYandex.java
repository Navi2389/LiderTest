package LiderTestProject;

import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import projectLiderTest.pagesYandexGoogle.*;

import static projectLiderTest.pagesYandexGoogle.BaseViewLiderTest.BASE_URL_Yandex;

@Feature("Тестовое задание для Лидер тестирования: три тест кейса - первый на вход в почтовый ящик на www.yandex.ru;" +
        " второй - на гугл поиск, в поисковую строку вводятся слова\n" +
        "«купить кофемашину bork c804», результатов больше 10 и в выдаче\n" +
        "присутствует mvideo.ru; третий - зайди на https://reqres.in и напиши автотест на тестирование эндпоинта\n" +
        "[GET] SINGLE USER (https://reqres.in/api/single_user).\n" +
        "Должна осуществляться проверка, что сервер возвращает статус 200 и\n" +
        "first_name = “Janet”\n" +
        "(опционально)  ")

public class TestCaseYandex extends BaseTestGeneral {

    @BeforeEach
    @Step("Переход на страницу Яндекса по URL")
    public void goToPage() {
        driver.get(BASE_URL_Yandex);
    }

    @Test
    @Step("Тест №1 авторизация на сайте www.yandex.ru")
        // авторизация на сайте
    void loginTestYandexBoxPage() throws InterruptedException {
        new LoginPageLiderTest(driver)
                .fillInputLogin("TestLiderTest")
                .submitLogin();

        Thread.sleep(3000);

        new PasswordPageLiderTest(driver)
                .fillInputPassword("@TestLiderTest@")
                .submitPassword();

        Thread.sleep(8000);

        /*//       new AddMailPageLiderTest(driver)
        /////         .submitNotNow();*/


    }
}
