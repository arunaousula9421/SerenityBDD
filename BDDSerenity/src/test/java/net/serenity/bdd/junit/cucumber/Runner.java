package net.serenity.bdd.junit.cucumber;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by arun on 24/05/2017.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        plugin = {"pretty","html:target/cucumber","json:target/json/cucumber.json"})
        //tags = {"@Compose"})
public class Runner {
}
