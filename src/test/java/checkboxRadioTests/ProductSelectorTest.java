package checkboxRadioTests;

import baseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductSelectorTest extends Hooks {

    @Test
    public void productSelectorTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOncheckboxRadio();

        pages.getWebAutomationPage().clickOnProductSelector();

        pages.getProductSelector().clickOnBranOptions(2);

        String expectedText = "Brand 3";
        String actualText = pages.getProductSelector().getBrandText();

        assertEquals(expectedText,actualText);

        BrowserUtils.scrollDownWithPageDown();
        pages.getProductSelector().clickOnShapeOptions(2);

        assertTrue(pages.getProductSelector().getShape(2));

        pages.getProductSelector().clickOnStyleOptions(1);

        assertTrue(pages.getProductSelector().isBorderSelected());


    }
}
