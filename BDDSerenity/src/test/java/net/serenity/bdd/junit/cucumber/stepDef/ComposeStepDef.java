package net.serenity.bdd.junit.cucumber.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenity.bdd.junit.cucumber.model.ComposeData;
import net.serenity.bdd.junit.cucumber.steps.ComposeTestSteps;
import net.serenity.bdd.junit.cucumber.steps.LoginTestSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by arun on 26/05/2017.
 */
public class ComposeStepDef {

    ComposeData composeDataProvider = new ComposeData();

    @Steps
    LoginTestSteps LTSteps;
    @Steps
    ComposeTestSteps CTSteps;


    @Given("^I have All Test Data \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" for Compose Sceanrio$")
    public void i_have_All_Test_Data_for_Compose_Sceanrio(String userName, String password, String toAddress, String subject, String body) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        composeDataProvider.setAll(userName, password, toAddress, subject, body);
    }

    @Given("^I should see my Account Mails$")
    public void i_should_see_my_Account_Mails() throws Throwable {
        LTSteps.isInboxPresent();

    }

    @When("^I compose an email to \"([^\"]*)\"$")
    public void i_compose_an_email_to(String arg1) throws Throwable {
        CTSteps.performCompose(composeDataProvider);

    }

    @Then("^I Should see a successful mail sent\\.$")
    public void i_Should_see_a_successful_mail_sent() throws Throwable {
        CTSteps.checkForMailStatus();
    }

}
