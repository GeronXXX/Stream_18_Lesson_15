package stream18.LandingPageTest.landingPageTest.user_date;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void beforeALL() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 40000;
    }


}

