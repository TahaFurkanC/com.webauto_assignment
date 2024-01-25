package iframeTest;

import baseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalIframe_Test extends Hooks {
    @Test
    public void nomralIframeTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnIframeLink();

        //5.Verify that the header text "Inar academy" In iframe
        String expectedHeader = "Inar academy";
        String actualHeader = pages.getNormalPage().getTitleOfIframe();
        assertEquals(expectedHeader, actualHeader);

        //6.Exit from the iframe
        pages.getNormalPage().switchToParentFrame();

        //7.verify condition that more information button in iframe works successfully
        String expectedText = "Example Domains";
        String actualText = pages.getNormalPage().getTitleOfIframe();
        assertEquals(expectedText, actualText);


    }
}
