package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;


public class DropDownTests extends BaseTests {

    @Test
    public void testDropdown(){
        var dropdownPage = homePage.clickOnDropdownLink();
        dropdownPage.selectFromDropdown("Option 1");
    }
}
