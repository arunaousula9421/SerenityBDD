package net.serenity.bdd.junit.cucumber.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by arunkumar on 24-05-2017.
 */
public class LoginStepDef {
    @Given("^I use Valid \"([^\"]*)\" and Valid \"([^\"]*)\"$")
    public void i_use_Valid_and_Valid(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("I'm in Given Method");
    }

    @When("^I perform Login Action$")
    public void i_perform_Login_Action() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("I'm in When Method");
    }

    @Then("^I should see my Account Mails\\.$")
    public void i_should_see_my_Account_Mails() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
        System.out.println("I'm in Then Method");
    }
}
