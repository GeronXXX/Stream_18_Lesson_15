package stream18.landing_page_test.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stream18.landing_page_test.data.FakerTestData;
import stream18.landing_page_test.pages.PageObjects;

public class LandingPageTest extends TestBase {
    PageObjects pageObjects = new PageObjects();

    @Test
    @DisplayName("Проверка, что страница открылась")
    void openPageTest() {
        pageObjects.openPage()
                .textLending("Первый ОФД – первый ", "оператор фискальных данных");
    }

    @Test
    @DisplayName("Проверка, что кнопка не задизайблена 'Отправить заявку'")
    void analyticsMenuTest() {
        pageObjects.openPage()
                .menuAnalytics()
                .salesMonitoringButton()
                .setStellungnahmeName(FakerTestData.firstName)
                .setStellungnahmeEmail(FakerTestData.email)
                .setStellungnahmePhone(FakerTestData.phoneNumber)
                .verificationlungnahmeButtonNotDisabled();
    }
    @Test
    @DisplayName("Проверка, поиска чека по ФН, ФД, ФПД")
    void consumerCheckSearchTest() {
        pageObjects.openPage()
                .footerMenuVerificationChek()
                .numberFn("9289440300712966")
                .numberFd("186968")
                .numberFp("2494402381")
                .searchFormButtonFind()
                .textCheckFound("Чек найден");
    }
    @Test
    @DisplayName("Проверка, поиска чека по ссылке")
    void consumerCheckSearchLinkSearchTest() {
        pageObjects.openPage()
                .footerMenuVerificationChek()
                .consumerMenuButtonLinkSearch()
                .fieldlinkCheck("https://consumer.1-ofd.ru/ticket?t=20210822T1058&s=1600.00&fn" +
                        "=9289440300712966&i=186968&fp=2494402381&n=1")
                .searchByLinkFormButtonFind()
                .textCheckFound("Чек найден");
    }

    @Test
    @DisplayName("Проверка тултипа на странице регистрации")
    void registrationTooltipTest() {
        pageObjects.openPage()
                .blockEnterButtonRegister()
                .registrationButtonContinue()
                .registrationFieldName()
                .registrationTooltip("Обязательное поле!");
    }
}