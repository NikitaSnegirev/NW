package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    private SelenideElement personalAccountAccorder = $(byTagAndText("span", "Личный кабинет")),
            loginOnToolbarButton = $(byTagAndText("span", "Войти"));
    public HomePage openPage() {
        open("");

        return this;
    }

    public HomePage hoverPersonalAccount() {
        personalAccountAccorder.hover();

        return this;
    }

    public AuthorizationPage clickLoginOnToolbar() {
        loginOnToolbarButton.click();

        return page(AuthorizationPage.class);
    }
}
