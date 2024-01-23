package dialogTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ModalFormTest extends Hooks {
    @Test
    public void modalFormTest(){
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnDialogTab();

        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnModalFormTab();

        pages.getModalForm().clickOnCreateAccountButton();

        pages.getModalForm().fillTheName("Taha");

        BrowserUtils.scrollDownWithPageDown();
        pages.getModalForm().fillTheSurname("Cetinkaya");

        pages.getModalForm().fillTheMail("cetinkayatahafurkan@gmail.com");

        int initialSizeOfDatas = pages.getModalForm().getSizeOfDatas();
        pages.getModalForm().clickTheSubmitButton();
        int finalSizeOfDatas = pages.getModalForm().getSizeOfDatas();

        assertNotEquals(initialSizeOfDatas,finalSizeOfDatas);
    }
}
