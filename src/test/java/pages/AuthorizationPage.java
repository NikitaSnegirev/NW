package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {
    private SelenideElement emailInput = $("[name=nm-email"),
            passwordInput = $("[name=nm-pass"),
            loginButton = $(byTagAndText("button", "Войти")),
            successfulAuthorizationCheck = $(byTagAndText("div",
                    "Пользователь авторизован успешно")),
            unsuccessfulAuthorizationWithoutPasswordOrLoginCheck = $(byTagAndText("div",
                    "Не задан логин или пароль")),
            registrationOnTabButton = $(byTagAndText("a", "Регистрация"));

    public AuthorizationPage setEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    public AuthorizationPage setPassword(String password) {
        passwordInput.setValue(password);

        return this;
    }

    public AuthorizationPage clickLogin() {
        loginButton.click();

        return this;
    }

    public AuthorizationPage checkSuccessfulAuthorization () {
        successfulAuthorizationCheck.shouldBe(visible);

        return this;
    }

    public AuthorizationPage checkUnsuccessfulAuthorizationWithoutPasswordOrLogin () {
        unsuccessfulAuthorizationWithoutPasswordOrLoginCheck.shouldBe(visible);

        return this;
    }

    public AuthorizationPage clearEmail() {
        emailInput.clear();

        return this;
    }

    public RegistrationPage clickRegistrationOnTab() {
        registrationOnTabButton.click();

        return page(RegistrationPage.class);
    }
}