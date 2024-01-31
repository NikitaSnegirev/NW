package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void beforeALL() {
        Configuration.browserSize = "1440x900";
        Configuration.baseUrl = "https://autotest-trunk.test.newsmine.ru/";
        //Configuration.holdBrowserOpen = true;
    }
}
