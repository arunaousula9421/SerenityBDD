package net.serenity.bdd.junit.cucumber.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenity.bdd.junit.cucumber.steps.LoginTestSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by arunkumar on 24-05-2017.
 */
public class LoginStepDef extends GenericDeclarationClass {

    LoginData dp= new LoginData();

    @Steps
    LoginTestSteps LT_steps;


    @Given("^I use Valid \"([^\"]*)\" and Valid \"([^\"]*)\"$")
    public void i_use_Valid_and_Valid(String userName, String passWord) throws Throwable {
        dp.setAll(userName, passWord);
        System.out.println("User & pwd:" + dp.getUserName() +dp.getPassword());
    }

    @When("^I perform Login Action$")
    public void i_perform_Login_Action() throws Throwable {
        LT_steps.openHomePage();
        LT_steps.performLogin(dp);
    }

    @Then("^I should see my Account Mails\\.$")
    public void i_should_see_my_Account_Mails() throws Throwable {
       LT_steps.isInboxPresent();
    }
}
