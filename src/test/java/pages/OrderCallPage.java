package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;


public class OrderCallPage {

    private SelenideElement fullNameInput = $("div#spu-2453 input[name=your-name]"),
            phoneInput = $("div#spu-2453 input[name=your-phone]"),
            emailInput = $("div#spu-2453 input[name=your-email]"),
            cityInput = $("div#spu-2453 input[name=your-city]"),
            oredCallOnHomePageButton = $(byTagAndText("a", "заказать звонок")),
            successfulOrderCallCheck = $(byTagAndText("div",
                    "Спасибо за Ваше сообщение. Оно успешно отправлено.")),
            ordeCallButton = $("input[value='Заказать звонок']");

    @Step("Нажать на кнопку Заказть звонок")
   public OrderCallPage openPage() {
       open("");
       oredCallOnHomePageButton.click();

       return this;
   }

    @Step("Ввод ФИО")
    public OrderCallPage setFullName(String fullName) {
        fullNameInput.setValue(fullName);

        return this;
    }

    @Step("Ввод телефона")
    public OrderCallPage setPhone(String phone) {
        phoneInput.setValue(phone);

        return this;
    }

    @Step("Ввод email")
    public OrderCallPage setEmail (String email) {
        emailInput.setValue(email);

        return this;
    }

    @Step("Ввод города")
    public OrderCallPage setCity (String city) {
        cityInput.setValue(city);

        return this;
    }

    @Step("Проверка усешного заказа звонка")
    public OrderCallPage checkSuccessfulOrderCall () {
        successfulOrderCallCheck.shouldBe(visible);

        return this;
    }

    @Step("Нажать Заказать звонок")
    public OrderCallPage clickOrderCall() {
        ordeCallButton.click();

        return this;
    }
}
