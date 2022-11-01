package seray.Pages;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import seray.Utils.BrowserUtils;

public class Lab02_TariffPlanAddingPAge extends BrowserUtils {
    private static final Logger logger = Logger.getLogger(Lab02_TariffPlanAddingPAge.class);

    @FindBy(xpath = "//h1[.='Add Tariff Plans']")
    private WebElement Header;

    @FindBy(xpath = "//input[@name='rental']")
    private WebElement MonthlyRentalBox;

    @FindBy(xpath = "//input[@name='local_minutes']")
    private WebElement LocalMinutesBox;

    @FindBy(xpath = "//input[@name='inter_minutes']")
    private WebElement InternationalMinutesBox;

    @FindBy(xpath = "//input[@name='sms_pack']")
    private WebElement SmsBox;

    @FindBy(xpath = "//input[@name='minutes_charges']")
    private WebElement MinutesChargesBox;

    @FindBy(xpath = "//input[@name='inter_charges']")
    private WebElement InternationalChargesBox;

    @FindBy(xpath = "//input[@name='sms_charges']")
    private WebElement SmsChargesBox;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement SubmitButton;

    public void setMonthlyRentalBox(String rental) {
        MonthlyRentalBox.sendKeys(rental);
    }

    public void setLocalMinutesBox(String localMinutes) {
        LocalMinutesBox.sendKeys(localMinutes);
    }

    public void setInternationalMinutesBox(String internationalMinutes) {
        InternationalMinutesBox.sendKeys(internationalMinutes);
    }

    public void setSmsBox(String sms) {
        SmsBox.sendKeys(sms);
    }

    public void setMinutesChargesBox(String minutesCharges) {
        MinutesChargesBox.sendKeys(minutesCharges);
    }

    public void setInternationalChargesBox(String internationalCharges) {
        InternationalChargesBox.sendKeys(internationalCharges);
    }

    public void setSmsChargesBox(String smsCharges) {
        SmsChargesBox.sendKeys(smsCharges);
    }

    public void setSubmitButton() {
        SubmitButton.click();
    }

    public void getVerificationHeader(String header) {
        Assert.assertEquals(Header.getText(),header);
    }
}
