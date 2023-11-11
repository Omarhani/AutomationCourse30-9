package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private final By formAuthenticationLink = By.linkText("Form Authentication");

    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");

    private final By dropDownLink = By.linkText("Dropdown");
    private final By jsAlertsLink = By.linkText("JavaScript Alerts");

    private final By wysiwygEditor =By.linkText("WYSIWYG Editor");

    private final By hoverLink = By.linkText("Hovers");

    private final By dragAndDropLink = By.linkText("Drag and Drop");


    public LoginPage clickOnFormAuthenticationLink(){
        clickOnLink(formAuthenticationLink);
        return new LoginPage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        clickOnLink(dynamicLoadingLink);
        return new DynamicLoadingPage(driver);
    }
    public DropdownPage clickOnDropdownLink(){
        clickOnLink(dropDownLink);
        return new DropdownPage(driver);
    }
    public JSAlertPage clickOnJSAlertsLink(){
        clickOnLink(jsAlertsLink);
        return new JSAlertPage(driver);
    }

    public WYSIWYGEditorPage clickOnWYSIWYGEditorLink(){
        clickOnLink(wysiwygEditor);
        return new WYSIWYGEditorPage(driver);
    }
    public HoverPage clickOnHoverLink(){
        clickOnLink(hoverLink);
        return new HoverPage(driver);
    }
    public DragAndDropPage clickOnDragAndDropLink(){
        clickOnLink(dragAndDropLink);
        return new DragAndDropPage(driver);
    }
    private void clickOnLink(By locator){
        driver.findElement(locator).click();
    }
}
