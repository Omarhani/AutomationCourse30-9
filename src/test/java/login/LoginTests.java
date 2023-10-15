package login;

import base.BaseTests;
import org.testng.annotations.*;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {



    @Test(priority = 1)
    public void testSuccessfulLogin(){


        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();

        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String actualResult = secureAreaPage.getValidationMessage();
        String expectedResult = "You logged into a secure area!";
        assertTrue(actualResult.contains(expectedResult));

    }


    @Test(priority = 2)
    public void testInvalidUsername(){
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("asfsda");
        loginPage.insertPassword("fasdfsdaf");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String actualResult= secureAreaPage.getValidationMessage();
        String expectedResult = "Your username is invalid!";
        assertTrue(actualResult.contains(expectedResult));
    }


    @Test(priority = 3)
    public void testInvalidPassword(){
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("tomsmith");
        loginPage.insertPassword("fasdfsdaf");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        String actualResult= secureAreaPage.getValidationMessage();
        String expectedResult = "Your password is invalid!";
        assertTrue(actualResult.contains(expectedResult));

    }

}
