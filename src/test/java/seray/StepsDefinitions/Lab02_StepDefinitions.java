package seray.StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import seray.Pages.Lab02_HomePage;
import seray.Pages.Lab02_TariffPlanAddingPAge;
import seray.Pages.Lab02_VerifyPage;
import seray.Utils.BrowserUtils;
import seray.Utils.ConfigurationsReader;
import seray.Utils.Driver;

import java.util.Map;

public class Lab02_StepDefinitions extends BrowserUtils {
    Lab02_TariffPlanAddingPAge lab02TariffPlanAddingPAge = new Lab02_TariffPlanAddingPAge();
    Lab02_HomePage lab02HomePage = new Lab02_HomePage();
    Lab02_VerifyPage lab02_verifyPage = new Lab02_VerifyPage();

    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("guru99url"));
    }

    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        lab02HomePage.setAddTariffPlan();
    }

    @Then("The user wants to verify {string} header")
    public void the_user_wants_to_verify_header(String string){
        BrowserUtils.staticWait(3);
        lab02TariffPlanAddingPAge.getVerificationHeader(string);
    }

    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String, String> data) {
        lab02TariffPlanAddingPAge.setMonthlyRentalBox(data.get("Monthly Rental"));
        lab02TariffPlanAddingPAge.setLocalMinutesBox(data.get("Free Local Minutes"));
        lab02TariffPlanAddingPAge.setInternationalMinutesBox(data.get("Free International Minutes"));
        lab02TariffPlanAddingPAge.setSmsBox(data.get("Free SMS Pack"));
        lab02TariffPlanAddingPAge.setMinutesChargesBox(data.get("Local Per Minutes Charges"));
        lab02TariffPlanAddingPAge.setInternationalChargesBox((data.get("International Per Minutes Charges")));
        lab02TariffPlanAddingPAge.setSmsChargesBox(data.get("SMS Per Charges"));
    }

    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        lab02TariffPlanAddingPAge.setSubmitButton();
    }

    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        lab02_verifyPage.setVerificationText(string);
    }

}
