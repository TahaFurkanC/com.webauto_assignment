package draggableTests;

import baseTest.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HandlesTabTest extends Hooks {
    @Test
    public void handlesTabTest(){
        //1- Open the url and go to the Web Automation
        pages.getHomePage().clickOnWebAutomationLink();

        //2- Click on the Handles Tab
        pages.getWebAutomationPage().clickOnHandlesLink();

        //2-Drag and drop the first draggable element to the right and below
        Point initialPointForFirstBox = pages.getHandlesTab().getLocationOfFirstBox();
        pages.getHandlesTab().dragFirstBox(50,50);
        Point finalPointForFirstBox = pages.getHandlesTab().getLocationOfFirstBox();

        //3-Verify the first element moved from handle
        assertTrue(finalPointForFirstBox.getX() > initialPointForFirstBox.getX());
        assertTrue(finalPointForFirstBox.getY() > initialPointForFirstBox.getY());

        //4-Try to Drag and drop the second draggable element from the text box to the right and below
        Point initialPointForSecondBox = pages.getHandlesTab().getLocationOfSecondBox();
        pages.getHandlesTab().tryToDragSecondBox(50,50);
        Point finalPointForSecondBox = pages.getHandlesTab().getLocationOfSecondBox();

        //5-Verify that second draggable element does not move when try to drag from textarea
        assertEquals(finalPointForSecondBox,initialPointForSecondBox);
    }
}
