package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

public class LoginTests extends BaseTest {
    HomePage homePage = new HomePage();
    @Test
    void successfulAuthorization() {
        homePage.openPage()
                .hoverPersonalAccount()
                .clickLoginOnToolbar()
                .setEmail("snegirev@oe-it.ru")
                .setPassword("autotester")
                .clickLogin()

                .checkSuccessfulAuthorization();
    }

    @Test
    void unsuccessfulAuthorization() {
        homePage.openPage()
                .hoverPersonalAccount()
                .clickLoginOnToolbar()
                .clickLogin()

                .checkUnsuccessfulAuthorizationWithoutPasswordOrLogin()

                .setEmail("snegirev@oe-it.ru")
                .clickLogin()

                .checkUnsuccessfulAuthorizationWithoutPasswordOrLogin()

                .clearEmail()
                .setPassword("autotester")
                .clickLogin()

                .checkUnsuccessfulAuthorizationWithoutPasswordOrLogin();
    }
}
