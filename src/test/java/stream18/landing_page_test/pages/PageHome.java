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
    private final SelenideElement objectFooterMenu = $x("//nav[@class='footer__nav']");
    private final SelenideElement objecBlockEnter = $x("//a[contains(text(),'Зарегистрироваться')]");
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
    @Step("Нажать на ссылку (кнопку) 'Проверить чек'")
    public PageHome footerMenuVerificationChek() {
        objectFooterMenu.scrollIntoView(false).$(byText("Проверить чек")).click();
        return this;
    }
    @Step("Нажать кнопку 'Регистрация'")
    public PageHome blockEnterButtonRegister() {
        objecButtonEntrance.shouldBe(visible, enabled).hover();
        objecBlockEnter.shouldBe(enabled).hover();
        objecBlockEnter.shouldBe(visible, enabled).click();
        return this;
    }
}

