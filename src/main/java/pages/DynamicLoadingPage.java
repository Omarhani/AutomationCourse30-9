package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    WebDriver driver;
    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By example1 = By.partialLinkText("Example 1:");

    public OnePage clickOnExample1(){
        driver.findElement(example1).click();
        return new OnePage(driver);
    }

}
