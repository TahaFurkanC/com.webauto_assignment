package controlGroupTest;

import baseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ToolbarTest extends Hooks {
    @Test
    public void toolbarTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnControlGroup();

        String initialValues = pages.getToolbarTab().style();

        pages.getToolbarTab().selectAll("150%","Green","Blue");

        BrowserUtils.scrollUpWithPageUp();
        pages.getToolbarTab().clickOnBButton();
        pages.getToolbarTab().clickOnIButton();
        pages.getToolbarTab().clickOnUButton();


        String finalValues = pages.getToolbarTab().style();
        System.out.println(initialValues);
        System.out.println(finalValues);

        assertNotEquals(finalValues,initialValues);

    }
}
