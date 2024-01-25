package pages.datePicker;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class DisplayMultipleMonths extends BasePage {
    @FindBy(id = "datepicker-multiple-months")
    private WebElement inputSection;

    @FindBy(css = ".ui-datepicker-group.ui-datepicker-group-first> .ui-datepicker-calendar>tbody>tr>td>a")
    private List<WebElement> januaryDays;

    public String getInputSection(){
        return inputSection.getAttribute("value");
    }
    public void clickOnInputSection(){
        inputSection.click();
    }
    public void clickOnJanuaryDays(int i){
        januaryDays.get(i).click();
    }
}
