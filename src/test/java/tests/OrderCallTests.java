package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.OrderCallPage;

public class OrderCallTests extends BaseTest{
    OrderCallPage orderCall = new OrderCallPage();

    @DisplayName("�������� ��������� ������ ������")
    @Test
    void successfulOrderCall() {

        orderCall.openPage()
                .setFullName("������ ����")
                .setPhone("88009001020")
                .setEmail("dafdsf@mail.ru")
                .setCity("�������")
                .clickOrderCall()

                .checkSuccessfulOrderCall();
    }
}
