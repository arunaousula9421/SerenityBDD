package net.serenity.bdd.junit.cucumber.steps;

import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenity.bdd.junit.cucumber.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by arun on 25/05/2017.
 */
public class LoginTestSteps extends ScenarioSteps {

    LoginPage LP;

    @Step
    public void openHomePage(){
        LP.openHomePage_PO();



    }

    public void performLogin(LoginData dp) {
        LP.performLogin(dp);

    }
}
