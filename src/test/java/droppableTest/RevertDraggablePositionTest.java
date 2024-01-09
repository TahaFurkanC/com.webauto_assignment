package droppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RevertDraggablePositionTest extends Hooks{

    @Test
    public void testRevertDraggablePosition(){
        pages.getHomePage().clickOnWebAutomationLink();

        pages.getWebAutomationPage().clickOnDroppableLink();

        pages.getWebAutomationPage().clickOnRevertDraggablePositionLink();

        Point initialLocationOfReturnigBox = pages.getRevertDraggablePosition().getLocationOfReturningBox();

        pages.getRevertDraggablePosition().dragAndDropForReturningBox();

        Point finalLocationOfReturnigBox = pages.getRevertDraggablePosition().getLocationOfReturningBox();

        assertEquals(initialLocationOfReturnigBox,finalLocationOfReturnigBox,"First Box can not stay in the Target box");

        Point initialLocationOfNonReturnigBox = pages.getRevertDraggablePosition().getLocationOfNonReturningBox();

        pages.getRevertDraggablePosition().dragAndDropForNonReturningBox();

        BrowserUtils.wait(5);
        Point finalLocationOfNonReturningBox = pages.getRevertDraggablePosition().getLocationOfNonReturningBox();

        System.out.println(initialLocationOfNonReturnigBox);
        System.out.println(finalLocationOfNonReturningBox);

        assertNotEquals(initialLocationOfNonReturnigBox,finalLocationOfNonReturningBox,"Second box stays in the target box");
    }
}
