package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    private SelenideElement personalAccountAccorder = $(byTagAndText("span", "������ �������")),
            loginOnToolbarButton = $(byTagAndText("span", "�����")),
            LogOutOnToolbarButton = $(byTagAndText("span", "�����"));
    @Step("������� ������� ��������")
    public HomePage openPage() {
        open("");

        return this;
    }

    @Step("������� ����� �� ������ �������")
    public HomePage hoverPersonalAccount() {
        personalAccountAccorder.hover();

        return this;
    }

    @Step("������ �����")
    public AuthorizationPage clickLoginOnToolbar() {
        loginOnToolbarButton.click();

        return page(AuthorizationPage.class);
    }

    @Step("������ �����")
    public HomePage clickLogOutOnToolbar() {
        LogOutOnToolbarButton.click();

        return this;
    }
}
