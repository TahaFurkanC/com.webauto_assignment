package resizableTest;

import baseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import utils.BrowserUtils;

import static utils.JSUtils.js;


public class SynchronousResizeTest extends Hooks {
    @Test
    void SynchronousResizeTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnResizableLink();

        js.executeScript("window.scroll(0,200)");
        BrowserUtils.wait(2);

        pages.getWebAutomationPage().clickOnSynchronusResizeLink();

        Dimension initialDimensionOfMainElement = pages.getSynchronousResize().getDimensionOfMainBox();

        Dimension initialDimensionOfAlsoElement = pages.getSynchronousResize().getDimensionOfAlsoBox();

        pages.getSynchronousResize().pullHoldingElement(100,100);

        BrowserUtils.wait(2);

        Dimension finalDimensionOfMainElement = pages.getSynchronousResize().getDimensionOfMainBox();

        Dimension finalDimensionOfAlsoElement = pages.getSynchronousResize().getDimensionOfAlsoBox();

        Assertions.assertThat(finalDimensionOfMainElement.getWidth()).isGreaterThan(initialDimensionOfMainElement.getWidth());
        Assertions.assertThat(finalDimensionOfMainElement.getHeight()).isGreaterThan(initialDimensionOfMainElement.getHeight());

        Assertions.assertThat(finalDimensionOfAlsoElement.getWidth()).isGreaterThan(initialDimensionOfAlsoElement.getWidth());
        Assertions.assertThat(finalDimensionOfAlsoElement.getHeight()).isGreaterThan(initialDimensionOfAlsoElement.getHeight());
    }
}
