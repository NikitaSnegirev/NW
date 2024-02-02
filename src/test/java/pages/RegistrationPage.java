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
                            registrationButton = $(byTagAndText("button", "Зарегистрироваться")),
                            successfulRegistrationCheck = $(byTagAndText("div",
                                    "Вам выслано письмо для подтверждения регистрации. " +
                                            "После выполнения этого действия вы можете войти систему")),
                            notAllFieldsAreFilledInCkeck = $(byTagAndText("div",
                                    "Не все обязательные поля заполнены")),
                            incorrectEmailCkeck = $(byTagAndText("div",
                                    "Вы задали некорректный адрес электронной почты"));


    @Step("Ввод фамилии")
    public RegistrationPage setSecondName(String secondName) {
        secondNameInput.setValue(secondName);

        return this;
    }

    @Step("Ввод имени")
    public RegistrationPage setFirstName(String firstName) {
        firstNameInput.setValue(firstName);

        return this;
    }

    @Step("Ввод отчества")
    public RegistrationPage setMiddleName(String middleName) {
        middleNameInput.setValue(middleName);

        return this;
    }

    @Step("Ввод email")
    public RegistrationPage setEmail (String email) {
        emailInput.setValue(email);

        return this;
    }

    @Step("Ввод телефона")
    public RegistrationPage setPhone (String phone) {
        phoneInput.setValue(phone);

        return this;
    }

    @Step("Ввод организации")
    public RegistrationPage setCompany (String company) {
        companyInput.setValue(company);

        return this;
    }

    @Step("Ввод примечания")
    public RegistrationPage setComment (String comment) {
        commentInput.setValue(comment);

        return this;
    }

    @Step("Нажать Зарегестрироваться")
    public RegistrationPage clickRegistration () {
        registrationButton.click();

        return this;
    }

    @Step("Проверка успешной регистрации")
    public RegistrationPage checkSuccessfulRegistration () {
        successfulRegistrationCheck.shouldBe(visible);

        return this;
    }

    @Step("Нажать Enter и проверка наличия введенного номера в поле")
    public RegistrationPage pressEnterAndCheckNumberPhone () {
        phoneInput.pressEnter().shouldBe(empty);

        return this;
    }

    @Step("Проверка начилия сообщения Не все обязательные поля заполнены")
    public RegistrationPage checkNotAllFieldsAreFilledIn () {
        notAllFieldsAreFilledInCkeck.shouldBe(visible);

        return this;
    }

    @Step("Проверка сообщения о введенном некорректном email")
    public RegistrationPage checkIncorrectEmail () {
        incorrectEmailCkeck.shouldBe(visible);

        return this;
    }
}




