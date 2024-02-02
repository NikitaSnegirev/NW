package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

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

    @Step("Ввести email")
    public AuthorizationPage setEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    @Step("Ввести пароль")
    public AuthorizationPage setPassword(String password) {
        passwordInput.setValue(password);

        return this;
    }

    @Step("Нажать войти")
    public AuthorizationPage clickLogin() {
        loginButton.click();

        return this;
    }

    @Step("Проверка успешной авторизации")
    public AuthorizationPage checkSuccessfulAuthorization () {
        successfulAuthorizationCheck.shouldBe(visible);

        return this;
    }

    @Step("Проверка что после успешной авторизации окно с логином и паролем исчезло")
    public HomePage checkDisappearedWindowAfterSuccessfulAuthorization () {
        successfulAuthorizationCheck.shouldNotHave(visible);

        return page(HomePage.class);
    }

    @Step("Проверка неудачной авторизации без пароля или логина")
    public AuthorizationPage checkUnsuccessfulAuthorizationWithoutPasswordOrLogin () {
        unsuccessfulAuthorizationWithoutPasswordOrLoginCheck.shouldBe(visible);

        return this;
    }

    @Step("Очистить поле email")
    public AuthorizationPage clearEmail() {
        emailInput.clear();

        return this;
    }

    @Step("Перейти на вкладку Регистрация")
    public RegistrationPage clickRegistrationOnTab() {
        registrationOnTabButton.click();

        return page(RegistrationPage.class);
    }
}