package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    WebDriver driver;
    Select select ;
    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By dropdownList = By.cssSelector("#dropdown");

    public void selectFromDropdown(String visibleText){
        select = new Select(driver.findElement(dropdownList));
        select.selectByVisibleText(visibleText);
    }
}
