package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.HomePage;

public class RegistrationTests extends BaseTest {
    HomePage homePage = new HomePage();

    @DisplayName("�������� �������� �����������")
    @Test
    void successfulRegistration() {
        homePage.openPage()
                .hoverPersonalAccount()
                .clickLoginOnToolbar()
                .clickRegistrationOnTab()
                .setSecondName("������")
                .setFirstName("����")
                .setMiddleName("��������")
                .setEmail("qwert@gmail.com")
                .setPhone("7712237667")
                .setCompany("��� �������")
                .setComment("�������� �����������")
                .clickRegistration()

                .checkSuccessfulRegistration();
    }

    @DisplayName("�������� ����� ������������� ������ ��� �����������")
    @Test
    void InputIncorrectNumberPhoneRegistration() {
        homePage.openPage()
                .hoverPersonalAccount()
                .clickLoginOnToolbar()
                .clickRegistrationOnTab()
                .setPhone("123456789")

                .pressEnterAndCheckNumberPhone();
    }

    @DisplayName("��������� �������� ���������� �����������")
    @Test
    void unsuccessfulRegistration() {
        homePage.openPage()
                .hoverPersonalAccount()
                .clickLoginOnToolbar()
                .clickRegistrationOnTab()
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setSecondName("������")
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setFirstName("������")
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setMiddleName("�������")
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setEmail("regist")
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setPhone("7712237667")
                .clickRegistration()

                .checkNotAllFieldsAreFilledIn()

                .setCompany("�����")
                .clickRegistration()

                //���� ���������� �������� ��� ������������, �� �� ����� �� ������������
                //.checkNotAllFieldsAreFilledIn()

                //.setComment("�����������")
                //.clickRegistration()

                .checkIncorrectEmail();
    }

}
