package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * 1- Open the url and navigate to the Web Automation
 * 2- Click on the Constrain Movement
 * 3- Drag the first draggable element to the right and drop
 * 4- Verify that the first draggable element does not move
 * 5- Drag the second draggable element to the below and drop
 * 6- Verify that the second draggable element does not move
 * 7- Drag the third draggable element to up and left and drop
 * 8- Verify that the third draggable element does not move
 * 9- Drag the fourth draggable element to up and left and drop
 * 10- Verify that the fourth draggable element does not move
 */
public class ConstrainMovementTest extends Hooks {

    @Test
    public void testConstrainMovement(){
        //1- Open the url and go to the Web Automation
        pages.getHomePage().clickOnWebAutomationLink();

        //2- Click on the Constrain Movement
        pages.getWebAutomationPage().clickOnConstrainMovementLink();

        //3- Drag the first draggable element to the right and drop
        int initialXForFirstDraggableElement = pages.getConstrainMovement().getLocationOfDraggable1().getX();
        pages.getConstrainMovement().dragFirstBox(50,0);
        int finalXForFirstDraggableElement = pages.getConstrainMovement().getLocationOfDraggable1().getX();

        //4- Verify that the first draggable element does not move
        assertEquals(initialXForFirstDraggableElement,finalXForFirstDraggableElement,"First draggable element can not move horizontally");

        //5- Drag the second draggable element to the below and drop
        int initialYForSecondDraggableElement = pages.getConstrainMovement().getLocationOfDraggable2().getY();
        pages.getConstrainMovement().dragSecondBox(0,50);
        int finalYForSecondDraggableElement = pages.getConstrainMovement().getLocationOfDraggable2().getY();

        //6- Verify that the second draggable element does not move
        assertEquals(initialYForSecondDraggableElement,finalYForSecondDraggableElement,"Second draggable element can not move vertically");

        //7- Drag the third draggable element to up and left and drop
        Point initialPointForThirdElement = pages.getConstrainMovement().getLocationOfDraggable3();
        pages.getConstrainMovement().dragThirdBox(-50,-50);
        Point finalPointForThirdElement = pages.getConstrainMovement().getLocationOfDraggable3();

        //8- Verify that the third draggable element does not move
        assertEquals(initialPointForThirdElement,finalPointForThirdElement,"Third draggable element con not move to out of big box");

        //9- Drag the fourth draggable element to up and left and drop
        pages.getConstrainMovement().dragFourthBox(-50,-50);
        Point finalPointOfFourthElement = pages.getConstrainMovement().getLocationOfDraggable4();

        //10- Verify that the fourth draggable element does not move
        Point smallBox = pages.getConstrainMovement().getLocationOfSmallBox();
        assertTrue(finalPointOfFourthElement.getX() < smallBox.getX());
        assertTrue(finalPointOfFourthElement.getY() < smallBox.getY());
    }

}
