package pages.draggable;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class HandlesTab extends BasePage {
    @FindBy(id = "draggable13")
    private WebElement firstBox;

    @FindBy(id = "draggable14")
    private WebElement secondBox;

    @FindBy(css = "#draggable13 > p")
    private WebElement textAreaOfFirstBox;

    @FindBy(xpath = "//p[contains(text(),'but you')]")
    private WebElement textAreaOfSecondBox;

    public void dragFirstBox(int x,int y){
        actions.dragAndDropBy(textAreaOfFirstBox,x,y).perform();
    }
    public void tryToDragSecondBox(int x,int y){
        actions.dragAndDropBy(textAreaOfSecondBox,x,y);
    }
    public Point getLocationOfFirstBox(){
        return firstBox.getLocation();
    }
    public Point getLocationOfSecondBox(){
        return secondBox.getLocation();
    }
}
