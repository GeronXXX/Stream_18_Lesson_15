package stream18.landing_page_test.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class ObjecRegistration {
    private final SelenideElement objecRegistrationButtonContinue =
            $x("//div[@class='btn-box']");
    private final SelenideElement objecRegistrationFieldName =
            $x("//app-taxpayer-input[@placeholder='ФИО']//div[@class='taxpayer-input__wrap']");
    private final SelenideElement objecCdkOverlayContainer = $x("//div[@class='cdk-overlay-container']");
    @Step("Нажать кнопку 'Продолжить'")
    public ObjecRegistration registrationButtonContinue() {
        objecRegistrationButtonContinue.$(byText("Продолжить")).shouldBe(visible, enabled).hover();
        objecRegistrationButtonContinue.$(byText("Продолжить")).shouldBe(visible, enabled).click();
        return this;
    }

    @Step("Навести курсор на поле 'ФИО'")
    public ObjecRegistration registrationFieldName() {
        objecRegistrationFieldName.hover();
        return this;
    }

    @Step("Проверка тултипа")
    public ObjecRegistration registrationTooltip(String value) {
        objecCdkOverlayContainer.shouldHave(text(value));
        return this;
    }
}
