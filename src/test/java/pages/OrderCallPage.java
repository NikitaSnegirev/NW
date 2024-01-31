package pages;

import com.codeborne.selenide.SelenideElement;

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

   public OrderCallPage openPage() {
       open("");
       oredCallOnHomePageButton.click();

       return this;
   }
    public OrderCallPage setFullName(String fullName) {
        fullNameInput.setValue(fullName);

        return this;
    }

    public OrderCallPage setPhone(String phone) {
        phoneInput.setValue(phone);

        return this;
    }

    public OrderCallPage setEmail (String email) {
        emailInput.setValue(email);

        return this;
    }

    public OrderCallPage setCity (String city) {
        cityInput.setValue(city);

        return this;
    }

    public OrderCallPage checkSuccessfulOrderCall () {
        successfulOrderCallCheck.shouldBe(visible);

        return this;
    }

    public OrderCallPage clickOrderCall() {
        ordeCallButton.click();

        return this;
    }
}
