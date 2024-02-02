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

    @Step("Нажать вправо на слайдере")
    public Carousel clickNext () {
        nextIconButton.click();

        return this;
    }
    @Step("Нажать влево на слайдере")
    public Carousel clickPrev () {
        prevIconButton.click();

        return this;
    }
    @Step("Проверка наличия первой картинки на слайдере")
    public Carousel ckeckFirstPictureInCarousel() {
        firstPictureInCarousel.shouldBe(visible);

        return this;
    }
    @Step("Проверка наличия второй картинки на слайдере")
    public Carousel ckeckSecondPictureInCarousel() {
        secondPictureInCarousel.shouldBe(visible);

        return this;
    }
    @Step("Навести курсор на слайдер")
    public Carousel hoverActivePictureCarousel() {
        activePictureCarousel.hover();

        return this;
    }


}
