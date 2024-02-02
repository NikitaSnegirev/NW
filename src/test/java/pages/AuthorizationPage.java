package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class AuthorizationPage {
    private SelenideElement emailInput = $("[name=nm-email"),
            passwordInput = $("[name=nm-pass"),
            loginButton = $(byTagAndText("button", "�����")),
            successfulAuthorizationCheck = $(byTagAndText("div",
                    "������������ ����������� �������")),
            unsuccessfulAuthorizationWithoutPasswordOrLoginCheck = $(byTagAndText("div",
                    "�� ����� ����� ��� ������")),
            registrationOnTabButton = $(byTagAndText("a", "�����������"));

    @Step("������ email")
    public AuthorizationPage setEmail(String email) {
        emailInput.setValue(email);

        return this;
    }

    @Step("������ ������")
    public AuthorizationPage setPassword(String password) {
        passwordInput.setValue(password);

        return this;
    }

    @Step("������ �����")
    public AuthorizationPage clickLogin() {
        loginButton.click();

        return this;
    }

    @Step("�������� �������� �����������")
    public AuthorizationPage checkSuccessfulAuthorization () {
        successfulAuthorizationCheck.shouldBe(visible);

        return this;
    }

    @Step("�������� ��� ����� �������� ����������� ���� � ������� � ������� �������")
    public HomePage checkDisappearedWindowAfterSuccessfulAuthorization () {
        successfulAuthorizationCheck.shouldNotHave(visible);

        return page(HomePage.class);
    }

    @Step("�������� ��������� ����������� ��� ������ ��� ������")
    public AuthorizationPage checkUnsuccessfulAuthorizationWithoutPasswordOrLogin () {
        unsuccessfulAuthorizationWithoutPasswordOrLoginCheck.shouldBe(visible);

        return this;
    }

    @Step("�������� ���� email")
    public AuthorizationPage clearEmail() {
        emailInput.clear();

        return this;
    }

    @Step("������� �� ������� �����������")
    public RegistrationPage clickRegistrationOnTab() {
        registrationOnTabButton.click();

        return page(RegistrationPage.class);
    }
}