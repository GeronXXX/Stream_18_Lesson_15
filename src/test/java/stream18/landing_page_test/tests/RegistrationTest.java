package stream18.landing_page_test.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stream18.landing_page_test.pages.ObjecRegistration;
import stream18.landing_page_test.pages.PageHome;

public class RegistrationTest extends TestBase {
    ObjecRegistration objecRegistration = new ObjecRegistration();
    PageHome pageHome = new PageHome();
    @Test
    @DisplayName("Проверка тултипа на странице регистрации")
    void registrationTooltipTest() {
        pageHome.openPage()
                .blockEnterButtonRegister();
        objecRegistration.registrationButtonContinue()
                .registrationFieldName()
                .registrationTooltip("Обязательное поле!");
    }
}
