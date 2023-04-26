package stream18.LandingPageTest.landingPageTest;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PageObgects {
    private final SelenideElement obgectSubNavbar = $(".sub-navbar__menu-list.sub-navbar__menu-list--close li");
    private final SelenideElement obgectButtonSalesMonitoring = $(".analytics-solutions__list li").$(".analytics-solutions-preview-bottom")
            .$(".analytics-solutions-preview-button").$(".center").
            $(".button.button--size_small");

    @Step("Открыть страницу")
    public PageObgects openPage() {
        open("https://www.1-ofd.ru/");
        return this;
    }

    public PageObgects subNavbarAnalytics() {
        obgectSubNavbar.sibling(0).click();
        return this;
    }
    public PageObgects buttonSalesMonitoring() {
        obgectButtonSalesMonitoring.click();
        return this;
    }
}
