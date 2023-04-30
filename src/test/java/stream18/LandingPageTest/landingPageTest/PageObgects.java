package stream18.LandingPageTest.landingPageTest;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class PageObgects {
    private final SelenideElement obgectTextLending = $x("//h1[@class='block-header__headline']" +
            "//span[@class='block-header__headline-text']");
    private final SelenideElement obgectSubNavbar = $x("//nav[@class='sub-navbar__menu']");
    private final SelenideElement obgectSalesMonitoring = $x("//body/div[@id='analytics']" +
            "/div[1]/div[1]/main[1]/div[2]/div[1]/ul[1]/li[1]");
//    private final SelenideElement obgectSalesMonitoring = $x("");
    private final SelenideElement obgectStellungnahmeName = $x("//input[@id='form-analytics-name']");
    private final SelenideElement obgectStellungnahmeEmail = $x("//input[@id='form-analytics-email']");
    private final SelenideElement obgectStellungnahmePhone = $x("//input[@id='form-analytics-phone']");
    private final SelenideElement obgectlungnahmeButtonNotDisabled = $x("//form[@id='form-analytics']" +
            "//button[@class='button button--size_small button--font-size_none button--color_green button--icon_none" +
            " button--disabled_false button--position_auto button--ident_'][contains(text(),'Отправить заявку')]");
    private final SelenideElement obgectFooterMenu = $x("//nav[@class='footer__nav']");
    private final SelenideElement obgectNumberFn = $x("//input[@id='numberFn']");
    private final SelenideElement obgectNumberFd = $x("//input[@id='numberFd']");
    private final SelenideElement obgectNumberFp = $x("//input[@id='fp']");
    private final SelenideElement obgectSearchForm = $x("//form[@name='searchForm']");
    private final SelenideElement obgectPageHeade = $x("//div[@class='page-header']//h2");
    private final SelenideElement obgectConsumerRowMenu = $x("//ul[@class='nav nav-pills" +
            " nav-justified navsearch']");
    private final SelenideElement obgectFieldlinkCheck = $x("//input[@id='linkCheck']");
    private final SelenideElement obgectSearchByLinkForm = $x("//form[@name='searchByLinkForm']");
    private final SelenideElement obgecBlockEnter = $x("//a[contains(text(),'Зарегистрироваться')]");
    private final SelenideElement obgecRegistrationButtonContinue =
            $x("//div[@class='btn-box']");
    private final SelenideElement obgecRegistrationFieldName =
            $x("//app-taxpayer-input[@placeholder='ФИО']//div[@class='taxpayer-input__wrap']");
    private final SelenideElement obgecCdkOverlayContainer = $x("//div[@class='cdk-overlay-container']");
    private final SelenideElement obgecButtonEntrance = $x("//div[@class='banner']//div[3]");

    @Step("Открытие странице")
    public PageObgects openPage() {
        open("https://www.1-ofd.ru/");
        return this;
    }
    @Step("Текст на основной странице")
    public PageObgects TextLending(String value, String value2) {
        obgectTextLending.shouldHave(text(value), text(value2));
        return this;
    }
    @Step("Меню раздел Аналитика")
    public PageObgects menuAnalytics() {
        obgectSubNavbar.$(byText("Аналитика")).click();
        return this;
    }
    @Step("Кнопка 'Отправить заявку' на плашке 'Мониторинг продаж вашего бренда и брендов конкурентов'")
    public PageObgects salesMonitoringButton() {
        obgectSalesMonitoring.$(byText("Отправить заявку")).shouldBe(visible, enabled).hover();
        obgectSalesMonitoring.$(byText("Отправить заявку")).shouldBe(visible, enabled).click();
        return this;
    }
    @Step("Вставить имя")
    public PageObgects setStellungnahmeName(String firstName) {
        obgectStellungnahmeName.setValue(firstName);
        return this;
    }
    @Step("Вставить email")
    public PageObgects setStellungnahmeEmail(String email) {
        obgectStellungnahmeEmail.setValue(email);
        return this;
    }
    @Step("Вставить номер телефона")
    public PageObgects setStellungnahmePhone(String phoneNumber) {
        obgectStellungnahmePhone.setValue(phoneNumber);
        return this;
    }
    @Step("Проверка активной кнопки")
    public PageObgects VerificationlungnahmeButtonNotDisabled() {
        obgectlungnahmeButtonNotDisabled.shouldBe(enabled);
        return this;
    }
    @Step("Нажать на ссылку (кнопку) 'Проверить чек'")
    public PageObgects FooterMenuVerificationChek() {
        obgectFooterMenu.scrollIntoView(false).$(byText("Проверить чек")).click();
        return this;
    }
    @Step("Вставить номер ФН")
    public PageObgects NumberFn(String value) {
        obgectNumberFn.setValue(value);
        return this;
    }
    @Step("Вставить номер ФД")
    public PageObgects NumberFd(String value) {
        obgectNumberFd.setValue(value);
        return this;
    }
    @Step("Вставить номер ФПД")
    public PageObgects NumberFp(String value) {
        obgectNumberFp.setValue(value);
        return this;
    }
    @Step("Нажать кнопку найти")
    public PageObgects SearchFormButtonFind() {
        obgectSearchForm.$(byText("Найти")).click();
        return this;
    }
    @Step("Проверить текст 'Чек найден'")
    public PageObgects TextCheckFound(String value) {
        obgectPageHeade.shouldHave(text(value));
        return this;
    }
    @Step("Нажать на раздел меню 'Поиск по ссылке'")
    public PageObgects ConsumerMenuButtonLinkSearch() {
        obgectConsumerRowMenu.$(byText("Поиск по ссылке")).click();
        return this;
    }
    @Step("Вставить ссылку")
    public PageObgects FieldlinkCheck(String value) {
        obgectFieldlinkCheck.setValue(value);
        return this;
    }
    @Step("Нажать кнопку 'Найти'")
    public PageObgects SearchByLinkFormButtonFind() {
        obgectSearchByLinkForm.$(byText("Найти")).click();
        return this;
    }
    @Step("Нажать кнопку 'Найти'")
    public PageObgects BlockEnterButtonRegister() {
        obgecButtonEntrance.shouldBe(visible, enabled).hover();;
        obgecBlockEnter.shouldBe(enabled).hover();
        obgecBlockEnter.shouldBe(visible, enabled).click();
        return this;
    }
    @Step("Нажать кнопку 'Продолжить'")
    public PageObgects RegistrationButtonContinue() {
        obgecRegistrationButtonContinue.$(byText("Продолжить")).shouldBe(visible, enabled).hover();
        obgecRegistrationButtonContinue.$(byText("Продолжить")).shouldBe(visible, enabled).click();
        return this;
    }
    @Step("Навести курсор на поле 'ФИО'")
    public PageObgects RegistrationFieldName() {
        obgecRegistrationFieldName.hover();
        return this;
    }
    @Step("Проверка тултипа")
    public PageObgects RegistrationTooltip(String value) {
        obgecCdkOverlayContainer.shouldHave(text(value));
        return this;
    }
}

