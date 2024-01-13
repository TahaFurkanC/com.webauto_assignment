package resizableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static utils.JSUtils.js;


public class TextAreaPageTest extends Hooks {
    @Test
    void TextAreaPageTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnResizableLink();

        js.executeScript("window.scroll(0,200)");
        BrowserUtils.wait(2);
        pages.getWebAutomationPage().clickOnTextAreaLink();

        int initialWidth = pages.getTextAreaPage().textAreaBoxDimension().getWidth();

        int initialHeight = pages.getTextAreaPage().textAreaBoxDimension().getHeight();

        pages.getTextAreaPage().pullIconMethod(50,50);

        BrowserUtils.wait(2);

        int finalWidth = pages.getTextAreaPage().textAreaBoxDimension().getWidth();

        int finalHeight = pages.getTextAreaPage().textAreaBoxDimension().getHeight();

        Assertions.assertThat(finalWidth).isGreaterThan(initialWidth);
        Assertions.assertThat(finalHeight).isGreaterThan(initialHeight);



    }
}
