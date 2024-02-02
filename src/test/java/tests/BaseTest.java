package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    static void beforeALL() {
        Configuration.browserSize = "1440x900";
        Configuration.baseUrl = "https://autotest-trunk.test.newsmine.ru/";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        //Configuration.holdBrowserOpen = true;
    }
}
