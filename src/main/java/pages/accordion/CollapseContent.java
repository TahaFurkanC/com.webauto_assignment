package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CollapseContent extends BasePage {

    @FindBy(id = "ui-id-9")
    private WebElement upperTab;

    @FindBy(css = "#ui-id-10>p")
    private WebElement innerPart;

    public void clickOnUpperTab(){
        upperTab.click();
    }
    public boolean isDisplayed(){
        return innerPart.isDisplayed();
    }
}
