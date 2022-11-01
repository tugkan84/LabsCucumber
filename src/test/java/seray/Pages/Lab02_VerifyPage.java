package seray.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seray.Utils.BrowserUtils;

public class Lab02_VerifyPage extends BrowserUtils {
    @FindBy(xpath = "//h2[.='Congratulation you add Tariff Plan']")
    private WebElement verificationText;
    public void setVerificationText(String expectedMessage) {
        Assert.assertEquals(verificationText.getText(), expectedMessage);
    }
}
