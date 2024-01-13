package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AcceptTab extends BasePage {
    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement nonDroppableElement;

    @FindBy(id = "draggable-accept")
    private WebElement droppableElement;

    @FindBy(id = "droppable-accept")
    private WebElement box;

    @FindBy(css = "#droppable-accept")
    private WebElement titleOfBox;

    public String getTitleOfBox(){
        return titleOfBox.getText();
    }
    public void dragAndDropNonDroppableElement(){
        actions.dragAndDrop(nonDroppableElement,box).perform();
    }
    public void dragAndDropDroppableElement(){
        actions.dragAndDrop(droppableElement,box).perform();
    }

}
