package datePickerTest;

import baseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class selectDateRangeTest extends Hooks {

    @Test
    public void testSelectDateRange() {

        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        //2.Click on the date picker button
        pages.getWebAutomationPage().clickOnDatepicker();

        //3.Click on the display multiple months button
        pages.getWebAutomationPage().clickOnSelectDateRange();

        BrowserUtils.scrollUpWithPageUp();
        //4.Click on 'from date text field'
        pages.getSelectDateRange().clickOnFromDateTextField();

        //5.Select 'Aug' from month selection drop box
        pages.getSelectDateRange().selectMonth("Aug");

        // 6.Select '8' from 'first' block
        pages.getSelectDateRange().pickDateFromCalendar("first", "8");

        //7.Verify that 08/08/2024 is displayed on 'from date text field'
        String expectedDateOnFromDateTextField = "08/08/2024";
        String actualDateOnFromDateTextField = pages.getSelectDateRange().getDateInFromDateTextField();

        assertEquals(expectedDateOnFromDateTextField, actualDateOnFromDateTextField, "Date is not correctly displayed!");

        //8.Click on 'to date text field'
        pages.getSelectDateRange().clickOnToDateTextField();

        // 9.Select '2' from 'first' block
        pages.getSelectDateRange().pickDateFromCalendar("first", "2");

        //10.Verify that nothing displayed on 'to date text field'
        String expectedDateOnToDateTextField = "";
        String actualDateOnToDateTextField = pages.getSelectDateRange().getDateInToDateTextField();

        assertEquals(expectedDateOnToDateTextField, actualDateOnToDateTextField, "There is a problem in From And To DateTextField Synchronization");

        //11.Click on 'to date text field'
        pages.getSelectDateRange().clickOnToDateTextField();

        //12.Verify that there are '24' day elements are selectable
        int expectedCountOfSelectableDays = 24;
        int actualCountOfSelectableDays = pages.getSelectDateRange().getSelectableDayNumberInFirstMonthElement();

        assertEquals(expectedCountOfSelectableDays, actualCountOfSelectableDays, "Count of selectable day is wrong!");
    }
}
