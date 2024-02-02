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
            oredCallOnHomePageButton = $(byTagAndText("a", "�������� ������")),
            successfulOrderCallCheck = $(byTagAndText("div",
                    "������� �� ���� ���������. ��� ������� ����������.")),
            ordeCallButton = $("input[value='�������� ������']");

    @Step("������ �� ������ ������� ������")
   public OrderCallPage openPage() {
       open("");
       oredCallOnHomePageButton.click();

       return this;
   }

    @Step("���� ���")
    public OrderCallPage setFullName(String fullName) {
        fullNameInput.setValue(fullName);

        return this;
    }

    @Step("���� ��������")
    public OrderCallPage setPhone(String phone) {
        phoneInput.setValue(phone);

        return this;
    }

    @Step("���� email")
    public OrderCallPage setEmail (String email) {
        emailInput.setValue(email);

        return this;
    }

    @Step("���� ������")
    public OrderCallPage setCity (String city) {
        cityInput.setValue(city);

        return this;
    }

    @Step("�������� �������� ������ ������")
    public OrderCallPage checkSuccessfulOrderCall () {
        successfulOrderCallCheck.shouldBe(visible);

        return this;
    }

    @Step("������ �������� ������")
    public OrderCallPage clickOrderCall() {
        ordeCallButton.click();

        return this;
    }
}
