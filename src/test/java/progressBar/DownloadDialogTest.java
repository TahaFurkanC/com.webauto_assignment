package progressBar;

import baseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DownloadDialogTest extends Hooks {
    @Test
    public void downloadDialogTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnProgressBar();

        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnDownloadDialog();

        pages.getDownloadDialogTab().clickStartDownloadButton();

        String verifierText = pages.getDownloadDialogTab().getFileDownloadText();
        assertEquals("File Download",verifierText,"A Tab that has the title of 'File Download' must reveal");
    }
}
