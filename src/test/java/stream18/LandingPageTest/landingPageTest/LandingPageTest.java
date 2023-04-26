package stream18.LandingPageTest.landingPageTest;

import org.junit.jupiter.api.Test;
import stream18.LandingPageTest.landingPageTest.user_date.TestBase;

public class LandingPageTest extends TestBase {
    PageObgects pageObgects = new PageObgects();

    @Test
    void analyticsMenuTest () {
        pageObgects.openPage()
                .subNavbarAnalytics()
                .buttonSalesMonitoring();
    }
}
