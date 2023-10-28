package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.JSAlertPage;

import static org.testng.Assert.assertEquals;

public class JSAlertTests extends BaseTests {

    @Test
    public void testJSAlert(){
        JSAlertPage jsAlertPage = homePage.clickOnJSAlertsLink();
        jsAlertPage.clickOnJSAlertButton();
        jsAlertPage.acceptJSAlert();
        String expectedResult = "You successfully clicked an alert";
        String actualResult = jsAlertPage.getValidationMessage();
        assertEquals(actualResult,expectedResult);


    }
}
