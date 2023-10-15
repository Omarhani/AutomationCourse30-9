package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By formAuthenticationLink = By.linkText("Form Authentication");


    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
