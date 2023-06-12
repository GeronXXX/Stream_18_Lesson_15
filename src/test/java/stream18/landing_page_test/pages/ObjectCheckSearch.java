package stream18.landing_page_test.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$x;

public class ObjectCheckSearch {
    private final SelenideElement objectNumberFn = $x("//input[@id='numberFn']");
    private final SelenideElement objectNumberFd = $x("//input[@id='numberFd']");
    private final SelenideElement objectNumberFp = $x("//input[@id='fp']");
    private final SelenideElement objectSearchForm = $x("//form[@name='searchForm']");
    private final SelenideElement objectPageHeade = $x("//div[@class='page-header']//h2");
    private final SelenideElement objectConsumerRowMenu = $x("//ul[@class='nav nav-pills" +
            " nav-justified navsearch']");
    private final SelenideElement objectFieldlinkCheck = $x("//input[@id='linkCheck']");
    private final SelenideElement objectSearchByLinkForm = $x("//form[@name='searchByLinkForm']");

    @Step("Вставить номер ФН")
    public ObjectCheckSearch numberFn(String value) {
        objectNumberFn.setValue(value);
        return this;
    }

    @Step("Вставить номер ФД")
    public ObjectCheckSearch numberFd(String value) {
        objectNumberFd.setValue(value);
        return this;
    }

    @Step("Вставить номер ФПД")
    public ObjectCheckSearch numberFp(String value) {
        objectNumberFp.setValue(value);
        return this;
    }

    @Step("Нажать кнопку найти")
    public ObjectCheckSearch searchFormButtonFind() {
        objectSearchForm.$(byText("Найти")).click();
        return this;
    }

    @Step("Проверить текст 'Чек найден'")
    public ObjectCheckSearch textCheckFound(String value) {
        objectPageHeade.shouldHave(text(value));
        return this;
    }

    @Step("Нажать на раздел меню 'Поиск по ссылке'")
    public ObjectCheckSearch consumerMenuButtonLinkSearch() {
        objectConsumerRowMenu.$(byText("Поиск по ссылке")).click();
        return this;
    }

    @Step("Вставить ссылку")
    public ObjectCheckSearch fieldlinkCheck(String value) {
        objectFieldlinkCheck.setValue(value);
        return this;
    }

    @Step("Нажать кнопку 'Найти'")
    public ObjectCheckSearch searchByLinkFormButtonFind() {
        objectSearchByLinkForm.$(byText("Найти")).click();
        return this;
    }
}
