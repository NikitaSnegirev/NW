package tests;

import org.junit.jupiter.api.Test;
import pages.HomePage;

public class RegistrationTests extends BaseTest {
    HomePage homePage = new HomePage();

    @Test
    void successfulRegistration() {
        homePage.openPage()
                .hoverPersonalAccount()
                .clickLoginOnToolbar()
                .clickRegistrationOnTab()
                .setSecondName("Иванов")
                .setFirstName("Иван")
                .setMiddleName("Иванович")
                .setEmail("qwert@gmail.com")
                .setPhone("7712237667")
                .setCompany("ООО Ромашка")
                .setComment("Тестовый комментарий")
                .clickRegistration()

                .checkSuccessfulRegistration();
    }

    @Test
    void InputIncorrectNumberPhoneRegistration() {
        homePage.openPage()
                .hoverPersonalAccount()
                .clickLoginOnToolbar()
                .clickRegistrationOnTab()
                .setPhone("123456789")

                .pressEnterAndCheckNumberPhone();
    }

    @Test
    void unsuccessfulRegistration() {
        homePage.openPage()
                .hoverPersonalAccount()
                .clickLoginOnToolbar()
                .clickRegistrationOnTab()
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setSecondName("Петров")
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setFirstName("Максим")
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setMiddleName("Юрьевич")
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setEmail("regist")
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setPhone("7712237667")
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setCompany("Смарт")
                .clickRegistration()

                //Поле примечание помечено как обязательное, но по факту не обязательное
                //.checkNotAllFieldsAreFilledIn()

                //.setComment("Регистрация")
                //.clickRegistration()

                .checkIncorrectEmail();
    }

}
