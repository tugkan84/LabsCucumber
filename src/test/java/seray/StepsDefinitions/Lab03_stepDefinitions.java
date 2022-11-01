package seray.StepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import org.junit.Assert;
import seray.Pages.Lab03;
import seray.Utils.BrowserUtils;
import seray.Utils.ConfigurationsReader;
import seray.Utils.Driver;

public class Lab03_stepDefinitions extends BrowserUtils {
    Lab03 lab03 = new Lab03();
    private static final Logger logger = Logger.getLogger(Lab03_stepDefinitions.class);

    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {
        lab03.setAddCustomerButton();
    }
    @Then("The users wants to verify {string} header")
    public void the_users_wants_to_verify_header(String string) {
        BrowserUtils.staticWait(3);
        lab03.setAddCustomerHeader(string);
    }
    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String backround) {
        BrowserUtils.staticWait(6);
        lab03.setBackGroundCheck(backround);
    }
    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String firstName, String lastName, String email, String address, String phoneNumber) {
        lab03.setFirstName(firstName);
        logger.info("Firstname is successfully provided");
        lab03.setLastName(lastName);
        logger.info("LastName is successfully provided");
        lab03.setEmail(email);
        logger.info("email is successfully provided");
        lab03.setAddress(address);
        logger.info("address is successfully provided");
        lab03.setMobileNumber(phoneNumber);
        logger.info("phone number is successfully provided");
    }
    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {
        lab03.setSubmitButton();
        Assert.assertEquals(lab03.getVerificationHeader().getText(),string);
    }

}
