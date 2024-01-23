package menuTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IconsTest extends Hooks {
    @Test
    public void iconsTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnMenuTab();

        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnIconsTab();

        pages.getIcons().hoverOnPlayback();

        List<String> list = pages.getIcons().makeListtTheElements();
        assertTrue(list.size() > 0);
    }
}
