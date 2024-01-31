package pages;

import com.codeborne.selenide.SelenideElement;

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
                            registrationButton = $(byTagAndText("button", "Зарегистрироваться")),
                            successfulRegistrationCheck = $(byTagAndText("div",
                                    "Вам выслано письмо для подтверждения регистрации. " +
                                            "После выполнения этого действия вы можете войти систему")),
                            notAllFieldsAreFilledInCkeck = $(byTagAndText("div",
                                    "Не все обязательные поля заполнены")),
                            incorrectEmailCkeck = $(byTagAndText("div",
                                    "Вы задали некорректный адрес электронной почты"));


    public RegistrationPage setSecondName(String secondName) {
        secondNameInput.setValue(secondName);

        return this;
    }

    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }

    public RegistrationPage setMiddleName(String middleName) {
        middleNameInput.setValue(middleName);

        return this;
    }

    public RegistrationPage setEmail (String email) {
        emailInput.setValue(email);

        return this;
    }

    public RegistrationPage setPhone (String phone) {
        phoneInput.setValue(phone);

        return this;
    }

    public RegistrationPage setCompany (String company) {
        companyInput.setValue(company);

        return this;
    }

    public RegistrationPage setComment (String comment) {
        commentInput.setValue(comment);

        return this;
    }

    public RegistrationPage clickRegistration () {
        registrationButton.click();

        return this;
    }

    public RegistrationPage checkSuccessfulRegistration () {
        successfulRegistrationCheck.shouldBe(visible);

        return this;
    }

    public RegistrationPage pressEnterAndCheckNumberPhone () {
        phoneInput.pressEnter().shouldBe(empty);

        return this;
    }

    public RegistrationPage checkNotAllFieldsAreFilledIn () {
        notAllFieldsAreFilledInCkeck.shouldBe(visible);

        return this;
    }

    public RegistrationPage checkIncorrectEmail () {
        incorrectEmailCkeck.shouldBe(visible);

        return this;
    }
}




