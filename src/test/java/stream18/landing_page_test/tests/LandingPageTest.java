package stream18.landing_page_test.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stream18.landing_page_test.data.FakerTestData;
import stream18.landing_page_test.pages.PageAnalitika;
import stream18.landing_page_test.pages.PageHome;

public class LandingPageTest extends TestBase {
    PageHome pageHome = new PageHome();
    PageAnalitika pageAnalitika = new PageAnalitika();
//    ObjectCheckSearch objectCheckSearch = new ObjectCheckSearch();
//    ObjecRegistration objecRegistration = new ObjecRegistration();


    @Test
    @DisplayName("Проверка, что страница открылась")
    void openPageTest() {
        pageHome.openPage()
                .textLending("Первый ОФД – первый ", "оператор фискальных данных");
    }
    @Test
    @DisplayName("Проверка, что кнопка не задизайблена 'Отправить заявку'")
    void analyticsMenuTest() {
        FakerTestData data = new FakerTestData();
        pageHome.openPage()
                .menuAnalytics();
        pageAnalitika.salesMonitoringButton()
                .setStellungnahmeName(data.firstName)
                .setStellungnahmeEmail(data.email)
                .setStellungnahmePhone(data.phoneNumber)
                .verificationlungnahmeButtonNotDisabled();
    }
//    @Test
//    @DisplayName("Проверка, поиска чека по ФН, ФД, ФПД")
//    void consumerCheckSearchTest() {
//        pageHome.openPage()
//                .footerMenuVerificationChek();
//        objectCheckSearch.numberFn("9289440300712966")
//                .numberFd("186968")
//                .numberFp("2494402381")
//                .searchFormButtonFind()
//                .textCheckFound("Чек найден");
//    }
//    @Test
//    @DisplayName("Проверка, поиска чека по ссылке")
//    void consumerCheckSearchLinkSearchTest() {
//        pageHome.openPage()
//                .footerMenuVerificationChek();
//        objectCheckSearch.consumerMenuButtonLinkSearch()
//                .fieldlinkCheck("https://consumer.1-ofd.ru/ticket?t=20210822T1058&s=1600.00&fn" +
//                        "=9289440300712966&i=186968&fp=2494402381&n=1")
//                .searchByLinkFormButtonFind()
//                .textCheckFound("Чек найден");
//    }
//    @Test
//    @DisplayName("Проверка тултипа на странице регистрации")
//    void registrationTooltipTest() {
//        pageHome.openPage()
//                .blockEnterButtonRegister();
//        objecRegistration.registrationButtonContinue()
//                .registrationFieldName()
//                .registrationTooltip("Обязательное поле!");
//    }
}