package droppableTest;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcceptTest extends Hooks {
    @Test
    public void acceptTest(){
        //1- Open the url and go to the Web Automation
        pages.getHomePage().clickOnWebAutomationLink();

        //2- Click on the Droppable Tab
        pages.getWebAutomationPage().clickOnDroppableLink();

        //3- Click on the Accept Tab
        pages.getWebAutomationPage().clickOnAcceptLink();

        //4- Try drag and drop to nonDroppable element to the box
        BrowserUtils.wait(2);
        String initialBoxMessageForFirstBox = pages.getAcceptTab().getTitleOfBox();
        pages.getAcceptTab().dragAndDropNonDroppableElement();
        String finalBoxMessageForFirstBox = pages.getAcceptTab().getTitleOfBox();

        //5- Verify that nonDroppable element can not dropped to the box
        assertEquals(initialBoxMessageForFirstBox,finalBoxMessageForFirstBox,"Box message must not change after nonDroppable elements drag and drop ");

        //6- Drag and drop the droppable element to the box
        String initialBoxMessageForSecondBox = pages.getAcceptTab().getTitleOfBox();
        pages.getAcceptTab().dragAndDropDroppableElement();
        String finalBoxMessageForSecondBox = pages.getAcceptTab().getTitleOfBox();

        //7- Verify that droppable element can dropped to the box
        assertEquals("accept: '#draggable'",initialBoxMessageForSecondBox);
        assertEquals("Dropped!",finalBoxMessageForSecondBox);
    }
}
