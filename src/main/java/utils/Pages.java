package utils;

import pages.dialog.ModalForm;
import pages.HomePage;
import pages.accordion.CollapseContent;
import pages.checkboxRadio.ProductSelector;
import pages.progressBar.DownloadDialogTab;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.autoComplete.AccentFolding;
import pages.autoComplete.MultipleAndRemote_Page;
import pages.controlGroup.ToolbarTab;
import pages.datePicker.DisplayMultipleMonths;
import pages.datePicker.SelectDateRangeTab;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovement;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.HandlesTab;
import pages.droppable.AcceptTab;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.RevertDraggablePosition;
import pages.iframe.NestedIframe_Page;
import pages.iframe.NormalIframe;
import pages.menu.Icons;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.SynchronousResize;
import pages.resizable.TextAreaPage;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.SerializePage;
import pages.slider.SnapToIncrements;
import pages.sortable.DisplayAsGrid;
import pages.spinner.SpinnerOverflow;

public class Pages {

    private ProductSelector productSelector;
    private AlertTypes_Page alertTypesPage;

    private Animate_Page animatePage;

    private AutoScrolling_Page autoScrollingPage;

    private ConstrainMovement constrainMovement;

    private Draggable_DefFunc_Page draggableDefFuncPage;

    private Droppable_DefFunc_Page droppableDefFuncPage;

    private HomePage homePage;

    private MultipleAndRemote_Page multipleAndRemotePage;

    private AccentFolding accentFolding;
    private NestedIframe_Page nestedIframePage;

    private NormalIframe normalIframe;

    private Resizable_DefFunc_Page resizableDefFuncPage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private SerializePage serializePage;

    private WebAutomationPage webAutomationPage;

    private RevertDraggablePosition revertDraggablePosition;

    private SynchronousResize synchronousResize;

    private TextAreaPage textAreaPage;

    private HandlesTab handlesTab;

    private AcceptTab acceptTab;

    private DisplayMultipleMonths displayMultipleMonths;
    private SelectDateRangeTab selectDateRangeTab;
    private DownloadDialogTab downloadDialogTab;
    private ToolbarTab toolbarTab;
    private Icons icons;
    private ModalForm modalForm;

    private SnapToIncrements snapToIncrements;

    private SpinnerOverflow spinnerOverflow;

    private CollapseContent collapseContent;
    private DisplayAsGrid displayAsGrid;
    public Pages() {
        displayAsGrid = new DisplayAsGrid();
        productSelector = new ProductSelector();
        collapseContent = new CollapseContent();
        spinnerOverflow = new SpinnerOverflow();
        snapToIncrements = new SnapToIncrements();
        modalForm = new ModalForm();
        icons = new Icons();
        toolbarTab = new ToolbarTab();
        downloadDialogTab = new DownloadDialogTab();
        selectDateRangeTab = new SelectDateRangeTab();
        displayMultipleMonths = new DisplayMultipleMonths();
        accentFolding = new AccentFolding();
        normalIframe = new NormalIframe();
        serializePage = new SerializePage();
        handlesTab = new HandlesTab();
        revertDraggablePosition = new RevertDraggablePosition();
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new NestedIframe_Page();
        alertTypesPage = new AlertTypes_Page();
        animatePage = new Animate_Page();
        constrainMovement = new ConstrainMovement();
        multipleAndRemotePage = new MultipleAndRemote_Page();
        synchronousResize = new SynchronousResize();
        textAreaPage = new TextAreaPage();
        acceptTab = new AcceptTab();
    }
    public DisplayAsGrid getDisplayAsGrid(){
        return displayAsGrid;
    }

    public ProductSelector getProductSelector(){
        return productSelector;
    }
    public CollapseContent getCollapseContent(){
        return collapseContent;
    }
    public SpinnerOverflow getSpinnerOverflow(){
        return  spinnerOverflow;
    }
    public SnapToIncrements getSnapToIncrements(){
        return snapToIncrements;
    }
    public ModalForm getModalForm(){
        return modalForm;
    }
    public Icons getIcons(){
        return icons;
    }

    public ToolbarTab getToolbarTab() {
        return toolbarTab;
    }

    public DownloadDialogTab getDownloadDialogTab(){
        return downloadDialogTab;
    }
    public SelectDateRangeTab getSelectDateRangeTab() {
        return selectDateRangeTab;
    }

    public AccentFolding getAccentFolding(){
        return accentFolding;
    }
    public DisplayMultipleMonths getDisplayMultipleMonths(){
        return displayMultipleMonths;
    }

    public NormalIframe getNormalIframe(){
        return normalIframe;
    }
    public SerializePage getSerializePage(){
        return serializePage;
    }
    public AcceptTab getAcceptTab(){
        return acceptTab;
    }

    public HandlesTab getHandlesTab(){
        return handlesTab;
    }
    public TextAreaPage getTextAreaPage(){
        return textAreaPage;
    }
    public SynchronousResize getSynchronousResize() {
        return synchronousResize;
    }

    public RevertDraggablePosition getRevertDraggablePosition(){
        return revertDraggablePosition;
    }
    public HomePage getHomePage() {
        return homePage;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }

    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }

    public Resizable_DefFunc_Page getResizableDefFuncPage(){
        return resizableDefFuncPage;
    }

    public Selectable_DefFunc_Page getSelectableDefFuncPage(){
        return selectableDefFuncPage;
    }

    public NestedIframe_Page getNestedIframePage(){
        return nestedIframePage;
    }

    public AlertTypes_Page getAlertTypesPage(){
        return alertTypesPage;
    }

    public Animate_Page getAnimatePage(){
        return animatePage;
    }

    public ConstrainMovement getConstrainMovement(){
        return constrainMovement;
    }

    public MultipleAndRemote_Page getMultipleAndRemotePage(){
        return multipleAndRemotePage;
    }

    public NormalIframe getNormalPage() {
        return normalIframe;
    }

    public SelectDateRangeTab getSelectDateRange() {
        return selectDateRangeTab;
    }
}
