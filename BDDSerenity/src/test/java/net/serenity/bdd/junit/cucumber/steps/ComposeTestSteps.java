package net.serenity.bdd.junit.cucumber.steps;

import net.serenity.bdd.junit.cucumber.model.ComposeData;
import net.serenity.bdd.junit.cucumber.pages.ComposePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by arun on 26/05/2017.
 */
public class ComposeTestSteps extends ScenarioSteps {
    
    ComposePage composePageObject;

    @Step
    public void performCompose(ComposeData composeDataProvider) {
        composePageObject.composeEmail(composeDataProvider);
    }

    @Step
    public void checkForMailStatus() {
        composePageObject.checkForSuccessMail();
    }
}
