package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends BaseTests {

    @Test
    public void testDynamicLoading() {
        var dynamicLoadingPage =
                homePage.clickOnDynamicLoadingLink();
        var onePage =
                dynamicLoadingPage.clickOnExample1();
        onePage.clickOnStartButton();

        String actualResult= onePage.getValidationMessage();
        String expectedResult = "Hello World!";
        assertEquals(actualResult,expectedResult);
    }
}
