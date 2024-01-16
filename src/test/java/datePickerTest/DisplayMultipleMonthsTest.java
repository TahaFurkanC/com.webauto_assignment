package datePickerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisplayMultipleMonthsTest extends Hooks {
    @Test
    public void displayMultipleMonthsTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnDatePickerLink();

        pages.getWebAutomationPage().clickOnDisplayMultipleMonthsLink();

        BrowserUtils.scrollUpWithPageUp();
        pages.getDisplayMultipleMonths().clickOnInputSection();

        BrowserUtils.wait(2);

        pages.getDisplayMultipleMonths().clickOnElevenMarch();

        BrowserUtils.wait(4);
        String date = pages.getDisplayMultipleMonths().getInputSection();

        assertEquals("03/11/2024",date,"when click on the 11 march 2024 it must show 03/11/2024");
    }
}
