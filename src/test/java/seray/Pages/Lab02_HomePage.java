package seray.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import seray.Utils.BrowserUtils;
import seray.Utils.Driver;

public class Lab02_HomePage extends BrowserUtils {
    private static final Logger logger = Logger.getLogger(Lab02_HomePage.class);


    @FindBy(xpath = "//a[.='Add Tariff Plan']")
    private WebElement AddTariffButton;

    public void setAddTariffPlan() {
        BrowserUtils.staticWait(2);
        AddTariffButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveByOffset(0, 0).click().build().perform();
    }
}
