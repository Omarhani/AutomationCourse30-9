package frame;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.WYSIWYGEditorPage;

public class FrameTests extends BaseTests {

    @Test
    public void testFrame() throws InterruptedException {
        WYSIWYGEditorPage wysiwygEditorPage =homePage.clickOnWYSIWYGEditorLink();
        Thread.sleep(3000);
        wysiwygEditorPage.clearText();
        wysiwygEditorPage.insertText("Hello World!");
        wysiwygEditorPage.clickOnIncreaseIndentButton();
        Thread.sleep(5000);
    }
}
