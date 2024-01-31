package tests;

import org.junit.jupiter.api.Test;
import pages.Carousel;
import pages.HomePage;

public class CarouselTest extends BaseTest {
    HomePage homePage = new HomePage();
    Carousel carousel = new Carousel();

    @Test
    void ckeckPictureInCarousel() {
        homePage.openPage();
        carousel.ckeckFirstPictureInCarousel()
                .hoverActivePictureCarousel()
                .clickNext()
                .ckeckSecondPictureInCarousel()
                .clickPrev()
                .ckeckFirstPictureInCarousel();
    }
}
