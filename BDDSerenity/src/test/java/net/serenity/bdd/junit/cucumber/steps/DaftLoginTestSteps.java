package net.serenity.bdd.junit.cucumber.steps;

import net.serenity.bdd.junit.cucumber.model.DaftLoginData;
import net.serenity.bdd.junit.cucumber.pages.DaftLoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by arunkumar on 26-05-2017.
 */
public class DaftLoginTestSteps extends ScenarioSteps {

    DaftLoginPage DLP;

    @Step
    public void openDaftPage(){
        DLP.openDaftPage_PO();
    }

    @Step
    public void daftPage(){
        DLP.daftLaunched();
    }

    @Step
    public void verifyLoginButton(){
        DLP.verifyLoginLink();
    }

    @Step
    public void clickLogin(){
        DLP.clickLoginLink();
    }

    @Step
    public void loginPage(){
        DLP.verifyLoginPage();
    }

    //Valid Details
   @Step
    public void sendUsername(DaftLoginData daftComposerData){
        DLP.enterUsername(daftComposerData);
    }

    @Step
    public  void sendPassword(DaftLoginData daftComposerData){
        DLP.enterPassword(daftComposerData);
    }

    @Step
    public void tapLogin(){
        DLP.clickLoginButton();
    }

    @Step
    public void savedPropertiesIsPresent(){
        DLP.savedProperties();
    }


 //Invalid Details
    @Step
    public void sendInvalidUsername(DaftLoginData daftComposerData){
        DLP.enterInvalidUsername(daftComposerData);
    }

    @Step
    public  void sendInvalidPassword(DaftLoginData daftComposerData){
        DLP.enterInvalidPassword(daftComposerData);
    }

    @Step
    public void errorMessageIsPresent(){
        DLP.errorMessageVisible();
    }
}
