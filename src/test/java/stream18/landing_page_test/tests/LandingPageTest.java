package stream18.landing_page_test.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stream18.landing_page_test.data.FakerTestData;
import stream18.landing_page_test.pages.PageAnalitika;
import stream18.landing_page_test.pages.PageHome;

public class LandingPageTest extends TestBase {
    PageHome pageHome = new PageHome();
    PageAnalitika pageAnalitika = new PageAnalitika();

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
}