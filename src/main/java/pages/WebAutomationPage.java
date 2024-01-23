package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebAutomationPage extends BasePage {

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Handles")
    private WebElement handlesLink;

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;

    @FindBy(linkText = "Datepicker")
    private WebElement datePicker;

    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRange;

    @FindBy(linkText = "Display Multiple Months")
    private WebElement displayMultipleMonths;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;

    @FindBy(linkText = "Accept")
    private WebElement acceptLink;

    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;

    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;

    @FindBy(linkText = "Serialize")
    private WebElement serializeLink;

    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;

    @FindBy(linkText = "Normal Iframe")
    private WebElement normalIframe;

    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;

    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;

    @FindBy(linkText = "Animate")
    private WebElement animateLink;

    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;

    @FindBy(linkText = "Autocomplete")
    private WebElement autoCompleteLink;

    @FindBy(linkText = "Accent Folding")
    private WebElement accentFoldingLink;

    @FindBy(linkText = "Multiple & Remote")
    private WebElement multipleAndRemoteLink;

    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggablePositionLink;

    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronusResizeLink;

    @FindBy (linkText = "Textarea")
    private WebElement textAreaLink;
    @FindBy(linkText = "Control Group")
    private WebElement controlGroup;
    @FindBy(linkText = "Progress Bar")
    private WebElement progressBar;

    @FindBy(linkText = "Download Dialog")
    private WebElement downloadDialog;

    @FindBy(linkText = "Menu")
    private WebElement menuTab;

    @FindBy(linkText = "Icons")
    private WebElement iconsTab;

    @FindBy(linkText = "Dialog")
    private WebElement dialogTab;

    @FindBy(linkText = "Modal Form")
    private WebElement modalForm;

    @FindBy(linkText = "Slider")
    private WebElement slider;
    @FindBy(linkText = "Snap to increments")
    private WebElement snapToIncrements;
    @FindBy(linkText = "Spinner")
    private WebElement spinner;

    @FindBy(linkText = "Spinner Overflow")
    private WebElement spinnerOverflowTab;

    public void clickOnSpinnerOverFlowTab(){
        spinnerOverflowTab.click();
    }

    public void clickOnSpinnerTab(){
        spinner.click();
    }
    public void clickOnSnapToIncrements(){
        snapToIncrements.click();
    }
    public void clickOnSlider(){
        slider.click();
    }
    public void clickOnModalFormTab(){
        modalForm.click();
    }
    public void clickOnDialogTab(){
        dialogTab.click();
    }
    public void clickOnIconsTab(){
        iconsTab.click();
    }
    public void clickOnMenuTab(){
        menuTab.click();
    }
    public void clickOnDownloadDialog(){
        downloadDialog.click();
    }
    public void clickOnProgressBar(){
        progressBar.click();
    }

    public void clickOnControlGroup(){
        controlGroup.click();
    }

    public void clickOnSelectDateRange(){
        selectDateRange.click();
    }
    public void clickOnNormalIframe(){
        normalIframe.click();
    }

    public void clickOnSerializeLink(){
        serializeLink.click();
    }

    public void clickOnDatePickerLink(){
        datePicker.click();
    }
    public void clickOnDisplayMultipleMonthsLink(){
        displayMultipleMonths.click();
    }

    public void clickOnAcceptLink(){
        acceptLink.click();
    }

    public void clickOnHandlesLink(){
        handlesLink.click();
    }


    public void clickOnTextAreaLink(){
        textAreaLink.click();
    }

    public void clickOnSynchronusResizeLink(){
        synchronusResizeLink.click();
    }

    public void clickOnRevertDraggablePositionLink(){
        revertDraggablePositionLink.click();
    }

    public void clickOnAutocompleteLink(){
        autoCompleteLink.click();
    }

    public void clickOnAccentFoldingLink(){
        accentFoldingLink.click();
    }
    public void clickMultipleAndRemoteLink(){
        multipleAndRemoteLink.click();
    }

    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }
    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickOnResizableLink(){
        resizableLink.click();
    }

    public void clickOnResizableDefaultFuncLink(){
        defaultFunctionalityLink.click();
    }

    public void clickOnSelectableLink(){
        selectableLink.click();
    }

    public void clickOnDefaultFunctionality(){
        defaultFunctionalityLink.click();
    }

    public void clickOnIframeLink(){
        iframeLink.click();
    }

    public void clickOnNestedIframe(){
        nestedIframeLink.click();
    }

    public void clickOnAlertsLink(){
        alertsLink.click();
    }

    public void clickOnAnimateLink(){
        animateLink.click();
    }
    public void clickOnConstrainMovementLink(){
        constrainMovementLink.click();
    }
}
