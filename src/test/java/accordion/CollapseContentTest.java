package accordion;

import baseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CollapseContentTest extends Hooks {

    @Test
    public void collapseContentTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnAccordion();

        pages.getWebAutomationPage().clickOnCollapseContent();

        pages.getCollapseContent().clickOnUpperTab();
        BrowserUtils.wait(2);

        assertFalse(pages.getCollapseContent().isDisplayed(),"currently open section must collapse");

    }
}
