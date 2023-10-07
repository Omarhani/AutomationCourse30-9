package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {



    @Test(priority = 1)
    public void testSuccessfulLogin(){


        // form link
        driver.findElement(By.linkText("Form Authentication")).click();

        // username and password
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");

        //login button
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();

        String expectedResult = "You logged into a secure area!";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        assertTrue(actualResult.contains(expectedResult));

    }


    @Test(priority = 2)
    public void testInvalidUsername(){


        // form link
        driver.findElement(By.linkText("Form Authentication")).click();

        // username and password
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith321312");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!");

        //login button
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();

        String expectedResult = "Your username is invalid!";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        assertTrue(actualResult.contains(expectedResult));


    }


    @Test(priority = 3)
    public void testInvalidPassword(){


        // form link
        driver.findElement(By.linkText("Form Authentication")).click();

        // username and password
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("tomsmith");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("SuperSecretPassword!12121");

        //login button
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();

        String expectedResult = "Your password is invalid!";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        assertTrue(actualResult.contains(expectedResult));


    }

}
