package stream18.landing_page_test.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class PageHome {
    private final SelenideElement objectTextLending = $x("//h1[@class='block-header__headline']" +
            "//span[@class='block-header__headline-text']");
    private final SelenideElement objectSubNavbar = $x("//header[@class='header']//li[2]");
//    private final SelenideElement objectSalesMonitoring = $x("//body/div[@id='analytics']" +
//            "/div[1]/div[1]/main[1]/div[2]/div[1]/ul[1]/li[1]");
    //    private final SelenideElement obgectSalesMonitoring = $x("");
//    private final SelenideElement objectStellungnahmeName = $x("//input[@id='form-analytics-name']");
//    private final SelenideElement objectStellungnahmeEmail = $x("//input[@id='form-analytics-email']");
//    private final SelenideElement objectStellungnahmePhone = $x("//input[@id='form-analytics-phone']");
//    private final SelenideElement objectlungnahmeButtonNotDisabled = $x("//form[@id='form-analytics']" +
//            "//button[@class='button button--size_small button--font-size_none button--color_green button--icon_none" +
//            " button--disabled_false button--position_auto button--ident_'][contains(text(),'Отправить заявку')]");
    private final SelenideElement objectFooterMenu = $x("//nav[@class='footer__nav']");
//    private final SelenideElement objectNumberFn = $x("//input[@id='numberFn']");
//    private final SelenideElement objectNumberFd = $x("//input[@id='numberFd']");
//    private final SelenideElement objectNumberFp = $x("//input[@id='fp']");
//    private final SelenideElement objectSearchForm = $x("//form[@name='searchForm']");
//    private final SelenideElement objectPageHeade = $x("//div[@class='page-header']//h2");
//    private final SelenideElement objectConsumerRowMenu = $x("//ul[@class='nav nav-pills" +
//            " nav-justified navsearch']");
//    private final SelenideElement objectFieldlinkCheck = $x("//input[@id='linkCheck']");
//    private final SelenideElement objectSearchByLinkForm = $x("//form[@name='searchByLinkForm']");
    private final SelenideElement objecBlockEnter = $x("//a[contains(text(),'Зарегистрироваться')]");
//    private final SelenideElement objecRegistrationButtonContinue =
//            $x("//div[@class='btn-box']");
//    private final SelenideElement objecRegistrationFieldName =
//            $x("//app-taxpayer-input[@placeholder='ФИО']//div[@class='taxpayer-input__wrap']");
//    private final SelenideElement objecCdkOverlayContainer = $x("//div[@class='cdk-overlay-container']");
    private final SelenideElement objecButtonEntrance = $x("//div[@class='banner']//div[3]");

    @Step("Открытие странице")
    public PageHome openPage() {
        open("https://www.1-ofd.ru/");
        return this;
    }

    @Step("Текст на основной странице")
    public PageHome textLending(String value, String value2) {
        objectTextLending.shouldHave(text(value), text(value2));
        return this;
    }

    @Step("Меню раздел Аналитика")
    public PageHome menuAnalytics() {
        objectSubNavbar.$(byText("Аналитика")).click();
        return this;
    }

//    @Step("Кнопка 'Отправить заявку' на плашке 'Мониторинг продаж вашего бренда и брендов конкурентов'")
//    public PageHome salesMonitoringButton() {
//        objectSalesMonitoring.$(byText("Отправить заявку")).shouldBe(visible, enabled).hover();
//        objectSalesMonitoring.$(byText("Отправить заявку")).shouldBe(visible, enabled).click();
//        return this;
//    }
//
//    @Step("Вставить имя")
//    public PageHome setStellungnahmeName(String firstName) {
//        objectStellungnahmeName.setValue(firstName);
//        return this;
//    }
//
//    @Step("Вставить email")
//    public PageHome setStellungnahmeEmail(String email) {
//        objectStellungnahmeEmail.setValue(email);
//        return this;
//    }
//
//    @Step("Вставить номер телефона")
//    public PageHome setStellungnahmePhone(String phoneNumber) {
//        objectStellungnahmePhone.setValue(phoneNumber);
//        return this;
//    }
//
//    @Step("Проверка активной кнопки")
//    public PageHome verificationlungnahmeButtonNotDisabled() {
//        objectlungnahmeButtonNotDisabled.shouldBe(enabled);
//        return this;
//    }

    @Step("Нажать на ссылку (кнопку) 'Проверить чек'")
    public PageHome footerMenuVerificationChek() {
        objectFooterMenu.scrollIntoView(false).$(byText("Проверить чек")).click();
        return this;
    }

//    @Step("Вставить номер ФН")
//    public PageHome numberFn(String value) {
//        objectNumberFn.setValue(value);
//        return this;
//    }
//
//    @Step("Вставить номер ФД")
//    public PageHome numberFd(String value) {
//        objectNumberFd.setValue(value);
//        return this;
//    }
//
//    @Step("Вставить номер ФПД")
//    public PageHome numberFp(String value) {
//        objectNumberFp.setValue(value);
//        return this;
//    }
//
//    @Step("Нажать кнопку найти")
//    public PageHome searchFormButtonFind() {
//        objectSearchForm.$(byText("Найти")).click();
//        return this;
//    }
//
//    @Step("Проверить текст 'Чек найден'")
//    public PageHome textCheckFound(String value) {
//        objectPageHeade.shouldHave(text(value));
//        return this;
//    }
//
//    @Step("Нажать на раздел меню 'Поиск по ссылке'")
//    public PageHome consumerMenuButtonLinkSearch() {
//        objectConsumerRowMenu.$(byText("Поиск по ссылке")).click();
//        return this;
//    }
//
//    @Step("Вставить ссылку")
//    public PageHome fieldlinkCheck(String value) {
//        objectFieldlinkCheck.setValue(value);
//        return this;
//    }
//
//    @Step("Нажать кнопку 'Найти'")
//    public PageHome searchByLinkFormButtonFind() {
//        objectSearchByLinkForm.$(byText("Найти")).click();
//        return this;
//    }

    @Step("Нажать кнопку 'Регистрация'")
    public PageHome blockEnterButtonRegister() {
        objecButtonEntrance.shouldBe(visible, enabled).hover();
        objecBlockEnter.shouldBe(enabled).hover();
        objecBlockEnter.shouldBe(visible, enabled).click();
        return this;
    }

//    @Step("Нажать кнопку 'Продолжить'")
//    public PageHome registrationButtonContinue() {
//        objecRegistrationButtonContinue.$(byText("Продолжить")).shouldBe(visible, enabled).hover();
//        objecRegistrationButtonContinue.$(byText("Продолжить")).shouldBe(visible, enabled).click();
//        return this;
//    }
//
//    @Step("Навести курсор на поле 'ФИО'")
//    public PageHome registrationFieldName() {
//        objecRegistrationFieldName.hover();
//        return this;
//    }
//
//    @Step("Проверка тултипа")
//    public PageHome registrationTooltip(String value) {
//        objecCdkOverlayContainer.shouldHave(text(value));
//        return this;
//    }
}

