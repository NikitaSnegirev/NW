package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    private SelenideElement personalAccountAccorder = $(byTagAndText("span", "Личный кабинет")),
            loginOnToolbarButton = $(byTagAndText("span", "Войти")),
            LogOutOnToolbarButton = $(byTagAndText("span", "Выйти"));
    @Step("Открыть главную страницу")
    public HomePage openPage() {
        open("");

        return this;
    }

    @Step("Навести мышку на Личный кабинет")
    public HomePage hoverPersonalAccount() {
        personalAccountAccorder.hover();

        return this;
    }

    @Step("Нажать Войти")
    public AuthorizationPage clickLoginOnToolbar() {
        loginOnToolbarButton.click();

        return page(AuthorizationPage.class);
    }

    @Step("Нажать Выйти")
    public HomePage clickLogOutOnToolbar() {
        LogOutOnToolbarButton.click();

        return this;
    }
}
