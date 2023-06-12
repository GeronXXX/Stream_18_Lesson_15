package stream18.landing_page_test.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class PageAnalitika {
    private final SelenideElement objectSalesMonitoring = $x("//body/div[@id='analytics']" +
            "/div[1]/div[1]/main[1]/div[2]/div[1]/ul[1]/li[1]");
    private final SelenideElement objectStellungnahmeName = $x("//input[@id='form-analytics-name']");
    private final SelenideElement objectStellungnahmeEmail = $x("//input[@id='form-analytics-email']");
    private final SelenideElement objectStellungnahmePhone = $x("//input[@id='form-analytics-phone']");
    private final SelenideElement objectlungnahmeButtonNotDisabled = $x("//form[@id='form-analytics']" +
            "//button[@class='button button--size_small button--font-size_none button--color_green button--icon_none" +
            " button--disabled_false button--position_auto button--ident_'][contains(text(),'Отправить заявку')]");

    @Step("Кнопка 'Отправить заявку' на плашке 'Мониторинг продаж вашего бренда и брендов конкурентов'")
    public PageAnalitika salesMonitoringButton() {
        objectSalesMonitoring.$(byText("Отправить заявку")).shouldBe(visible, enabled).hover();
        objectSalesMonitoring.$(byText("Отправить заявку")).shouldBe(visible, enabled).click();
        return this;
    }

    @Step("Вставить имя")
    public PageAnalitika setStellungnahmeName(String firstName) {
        objectStellungnahmeName.setValue(firstName);
        return this;
    }

    @Step("Вставить email")
    public PageAnalitika setStellungnahmeEmail(String email) {
        objectStellungnahmeEmail.setValue(email);
        return this;
    }

    @Step("Вставить номер телефона")
    public PageAnalitika setStellungnahmePhone(String phoneNumber) {
        objectStellungnahmePhone.setValue(phoneNumber);
        return this;
    }

    @Step("Проверка активной кнопки")
    public PageAnalitika verificationlungnahmeButtonNotDisabled() {
        objectlungnahmeButtonNotDisabled.shouldBe(enabled);
        return this;
    }
}
