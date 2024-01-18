package controlGroupTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class ToolbarTest extends Hooks {
    @Test
    public void toolbarTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnControlGroup();

        String initialValues = pages.getToolbarTab().style();

        pages.getToolbarTab().selectAll("150%");

    }
}
