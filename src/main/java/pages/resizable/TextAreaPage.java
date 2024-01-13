package pages.resizable;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


public class TextAreaPage extends BasePage {
    @FindBy(id = "resizable-text-area-res")
    private WebElement textAreaBox;

    @FindBy(css = ".ui-wrapper > .ui-icon")
    private WebElement pullIcon;

    public Dimension textAreaBoxDimension(){
        return textAreaBox.getSize();
    }

    public void pullIconMethod(int x,int y){
        actions.clickAndHold(pullIcon).moveByOffset(x,y).release().build().perform();
    }

}
