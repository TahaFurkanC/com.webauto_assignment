package pages.Dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class ModalForm extends BasePage {
    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    private WebElement createAccountButton;

    @FindBy(css = "#dialog-modalForm-sbt>form>div>input")
    private List<WebElement> nameSurnameMail;

    @FindBy(css = "#dialog-modalForm-sbt>form>button")
    private WebElement submitButton;

    @FindBy(css = "#dialog-container-modalForm-sbt>div>table>tbody>tr")
    private List<WebElement> usersDatas;

    public int getSizeOfDatas(){
        return usersDatas.size();
    }
    public void clickOnCreateAccountButton(){
        createAccountButton.click();
    }
    public void fillTheName(String name){
        nameSurnameMail.get(0).sendKeys(name);
    }
    public void fillTheSurname(String surname){
        nameSurnameMail.get(1).sendKeys(surname);
    }
    public void fillTheMail(String mail){
        nameSurnameMail.get(2).sendKeys(mail);
    }
    public void clickTheSubmitButton(){
        submitButton.click();
    }

}
