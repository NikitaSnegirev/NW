package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.empty;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    private SelenideElement secondNameInput = $("input[name=new_user_second_name"),
                            firstNameInput = $("input[name=new_user_first_name"),
                            middleNameInput = $("input[name=new_user_middle_name"),
                            emailInput = $("input[name=new_user_email"),
                            phoneInput = $("input[name=new_user_phone"),
                            companyInput = $("input[name=new_user_company"),
                            commentInput = $("textarea[name=new_user_comment"),
                            registrationButton = $(byTagAndText("button", "������������������")),
                            successfulRegistrationCheck = $(byTagAndText("div",
                                    "��� ������� ������ ��� ������������� �����������. " +
                                            "����� ���������� ����� �������� �� ������ ����� �������")),
                            notAllFieldsAreFilledInCkeck = $(byTagAndText("div",
                                    "�� ��� ������������ ���� ���������")),
                            incorrectEmailCkeck = $(byTagAndText("div",
                                    "�� ������ ������������ ����� ����������� �����"));


    @Step("���� �������")
    public RegistrationPage setSecondName(String secondName) {
        secondNameInput.setValue(secondName);

        return this;
    }

    @Step("���� �����")
    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }

    @Step("���� ��������")
    public RegistrationPage setMiddleName(String middleName) {
        middleNameInput.setValue(middleName);

        return this;
    }

    @Step("���� email")
    public RegistrationPage setEmail (String email) {
        emailInput.setValue(email);

        return this;
    }

    @Step("���� ��������")
    public RegistrationPage setPhone (String phone) {
        phoneInput.setValue(phone);

        return this;
    }

    @Step("���� �����������")
    public RegistrationPage setCompany (String company) {
        companyInput.setValue(company);

        return this;
    }

    @Step("���� ����������")
    public RegistrationPage setComment (String comment) {
        commentInput.setValue(comment);

        return this;
    }

    @Step("������ ������������������")
    public RegistrationPage clickRegistration () {
        registrationButton.click();

        return this;
    }

    @Step("�������� �������� �����������")
    public RegistrationPage checkSuccessfulRegistration () {
        successfulRegistrationCheck.shouldBe(visible);

        return this;
    }

    @Step("������ Enter � �������� ������� ���������� ������ � ����")
    public RegistrationPage pressEnterAndCheckNumberPhone () {
        phoneInput.pressEnter().shouldBe(empty);

        return this;
    }

    @Step("�������� ������� ��������� �� ��� ������������ ���� ���������")
    public RegistrationPage checkNotAllFieldsAreFilledIn () {
        notAllFieldsAreFilledInCkeck.shouldBe(visible);

        return this;
    }

    @Step("�������� ��������� � ��������� ������������ email")
    public RegistrationPage checkIncorrectEmail () {
        incorrectEmailCkeck.shouldBe(visible);

        return this;
    }
}




