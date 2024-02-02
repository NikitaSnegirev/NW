package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Carousel {
    private SelenideElement nextIconButton = $(".carousel-control-next-icon"),
                            prevIconButton = $(".carousel-control-prev-icon"),
                            firstPictureInCarousel = $("[src*='/Bez-imeni-1-1-kopiya.jpeg']"),
                            secondPictureInCarousel = $("[src*='Bez-imeni-20000.jpg']"),
                            activePictureCarousel = $(".carousel-item.active");

    @Step("������ ������ �� ��������")
    public Carousel clickNext () {
        nextIconButton.click();

        return this;
    }
    @Step("������ ����� �� ��������")
    public Carousel clickPrev () {
        prevIconButton.click();

        return this;
    }
    @Step("�������� ������� ������ �������� �� ��������")
    public Carousel ckeckFirstPictureInCarousel() {
        firstPictureInCarousel.shouldBe(visible);

        return this;
    }
    @Step("�������� ������� ������ �������� �� ��������")
    public Carousel ckeckSecondPictureInCarousel() {
        secondPictureInCarousel.shouldBe(visible);

        return this;
    }
    @Step("������� ������ �� �������")
    public Carousel hoverActivePictureCarousel() {
        activePictureCarousel.hover();

        return this;
    }


}
