package stream18.LandingPageTest.landingPageTest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import stream18.LandingPageTest.landingPageTest.user_date.TestBase;

import static stream18.LandingPageTest.landingPageTest.FakerTestDate.*;
@Tag("1ofd_tests")
public class LandingPageTest extends TestBase {
    PageObgects pageObgects = new PageObgects();

    @Test
    @DisplayName("Проверка, что страница открылась")
    void openPageTest() {
        pageObgects.openPage()
                .TextLending("Первый ОФД – первый ", "оператор фискальных данных");
    }
    @Test()
    @DisplayName("Проверка, что кнопка не задизайблена 'Отправить заявку'")
    void analyticsMenuTest() {
        pageObgects.openPage()
                .menuAnalytics()
                .salesMonitoringButton()
                .setStellungnahmeName(firstName)
                .setStellungnahmeEmail(email)
                .setStellungnahmePhone(phoneNumber)
                .VerificationlungnahmeButtonNotDisabled();
    }
    @Test
    @DisplayName("Проверка, поиска чека по ФН, ФД, ФПД")
    void consumerCheckSearchTest() {
        pageObgects.openPage()
                .FooterMenuVerificationChek()
                .NumberFn("9289440300712966")
                .NumberFd("186968")
                .NumberFp("2494402381")
                .SearchFormButtonFind()
                .TextCheckFound("Чек найден");
    }
    @Test
    @DisplayName("Проверка, поиска чека по ссылке")
    void consumerCheckSearchLinkSearchTest() {
        pageObgects.openPage()
                .FooterMenuVerificationChek()
                .ConsumerMenuButtonLinkSearch()
                .FieldlinkCheck("https://consumer.1-ofd.ru/ticket?t=20210822T1058&s=1600.00&fn" +
                        "=9289440300712966&i=186968&fp=2494402381&n=1")
                .SearchByLinkFormButtonFind()
                .TextCheckFound("Чек найден");
    }
    @Test
    @DisplayName("Проверка тултипа на странице регистрации")
    void RegistrationTooltipTest() {
        pageObgects.openPage()
                .BlockEnterButtonRegister()
                .RegistrationButtonContinue()
                .RegistrationFieldName()
                .RegistrationTooltip("Обязательное поле!");
    }
}