package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Carousel {
    private SelenideElement nextIconButton = $(".carousel-control-next-icon"),
                            prevIconButton = $(".carousel-control-prev-icon"),
                            firstPictureInCarousel = $("[src*='/Bez-imeni-1-1-kopiya.jpeg']"),
                            secondPictureInCarousel = $("[src*='Bez-imeni-20000.jpg']"),
                            activePictureCarousel = $(".carousel-item.active");

    public Carousel clickNext () {
        nextIconButton.click();

        return this;
    }

    public Carousel clickPrev () {
        prevIconButton.click();

        return this;
    }

    public Carousel ckeckFirstPictureInCarousel() {
        firstPictureInCarousel.shouldBe(visible);

        return this;
    }

    public Carousel ckeckSecondPictureInCarousel() {
        secondPictureInCarousel.shouldBe(visible);

        return this;
    }

    public Carousel hoverActivePictureCarousel() {
        activePictureCarousel.hover();

        return this;
    }


}
