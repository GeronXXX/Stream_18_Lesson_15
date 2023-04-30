package stream18.LandingPageTest.landingPageTest.user_date;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import stream18.LandingPageTest.helpers.Attach;

import java.util.Map;

public class TestBase {


        @BeforeAll
        static void beforeALL() {
            Configuration.baseUrl = System.getProperty("baseUrl", "https://www.1-ofd.ru/");
            Configuration.remote = "https://user1:1234@" + System.getProperty("remote", "selenoid.autotests.cloud/wd/hub");
            Configuration.browserSize = System.getProperty("browserSize");
            Configuration.browser = System.getProperty("browser", "chrome");
            Configuration.browserVersion = System.getProperty("browserVersion");

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));

            Configuration.browserCapabilities = capabilities;
        }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }
    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
    }
}



