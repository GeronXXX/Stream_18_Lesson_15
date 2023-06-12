package stream18.landing_page_test.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stream18.landing_page_test.pages.ObjectCheckSearch;
import stream18.landing_page_test.pages.PageHome;

public class CheckSearchTest {
    PageHome pageHome = new PageHome();
    ObjectCheckSearch objectCheckSearch = new ObjectCheckSearch();
    @Test
    @DisplayName("Проверка, поиска чека по ФН, ФД, ФПД")
    void consumerCheckSearchTest() {
        pageHome.openPage()
                .footerMenuVerificationChek();
        objectCheckSearch.numberFn("9289440300712966")
                .numberFd("186968")
                .numberFp("2494402381")
                .searchFormButtonFind()
                .textCheckFound("Чек найден");
    }
    @Test
    @DisplayName("Проверка, поиска чека по ссылке")
    void consumerCheckSearchLinkSearchTest() {
        pageHome.openPage()
                .footerMenuVerificationChek();
        objectCheckSearch.consumerMenuButtonLinkSearch()
                .fieldlinkCheck("https://consumer.1-ofd.ru/ticket?t=20210822T1058&s=1600.00&fn" +
                        "=9289440300712966&i=186968&fp=2494402381&n=1")
                .searchByLinkFormButtonFind()
                .textCheckFound("Чек найден");
    }
}
