package stream18.LandingPageTest.landingPageTest.user_date;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import stream18.LandingPageTest.helpers.Attach;

import java.util.Map;

public class TestBase {
    @BeforeAll
    static void beforeALL() {
        Configuration.browserSize = "2560x1440";
    }

    @AfterAll
    static void after() {
        Configuration.holdBrowserOpen = true;

    }
}
