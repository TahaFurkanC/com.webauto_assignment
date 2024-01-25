package datePickerTest;

import baseTest.Hooks;
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

        pages.getDisplayMultipleMonths().clickOnJanuaryDays(14);

        BrowserUtils.wait(4);
        String date = pages.getDisplayMultipleMonths().getInputSection();
        System.out.println(date);

        assertEquals("01/15/2024",date,"when click on the 15 January 2024 it must show 01/15/2024");
    }
}
