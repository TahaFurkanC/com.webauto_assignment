package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class DisplayAsGrid extends BasePage {

    @FindBy(css = "#sortable-disp-as-grid>li")
    private List<WebElement> numbers;

    public void dragAndDrop(String ){
        actions.dragAndDrop()
    }

}
