package net.serenity.bdd.junit.cucumber.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenity.bdd.junit.cucumber.model.DaftLoginData;
import net.serenity.bdd.junit.cucumber.steps.DaftLoginTestSteps;
import net.thucydides.core.annotations.Steps;

/**
 * Created by arunkumar on 26-05-2017.
 */
public class DaftLoginStepDef extends GenericDeclarationClass{

    DaftLoginData daftComposerData = new DaftLoginData();

    @Steps
    DaftLoginTestSteps DLTSteps;

    @Given("^Daft.ie has launched$")
    public void daft_ie_has_launched() throws Throwable {
        DLTSteps.openDaftPage();
    }

    @When("^Daft Website is launched$")
    public void daft_Website_is_launched() throws Throwable {
        DLTSteps.daftPage();
    }

    @When("^I am not logged in$")
    public void i_am_not_logged_in() throws Throwable {
        DLTSteps.verifyLoginButton();
    }

    @When("^I tap on Login link$")
    public void i_tap_on_Login_link() throws Throwable {
        DLTSteps.clickLogin();
    }

    @Then("^Login screen is displayed$")
    public void login_screen_is_displayed() throws Throwable {
        DLTSteps.loginPage();
    }

    @When("^I populate username \"([^\"]*)\"$")
    public void i_populate_username(String username) throws Throwable {
        daftComposerData.setUsername(username);
        System.out.println("Username: " +daftComposerData.getUsername());
        DLTSteps.sendUsername(daftComposerData);
    }

    @When("^I populate password \"([^\"]*)\"$")
    public void i_populate_password(String password) throws Throwable {
        daftComposerData.setPassword(password);
        System.out.println("Password: " +daftComposerData.getPassword());
        DLTSteps.sendPassword(daftComposerData);
    }

    @When("^I tap on the Login button$")
    public void i_tap_on_the_Login_button() throws Throwable {
        DLTSteps.tapLogin();
    }

    @Then("^Saved properties page is displayed$")
    public void saved_properties_page_is_displayed() throws Throwable {
        DLTSteps.savedPropertiesIsPresent();
    }
}
