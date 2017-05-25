package net.serenity.bdd.junit.cucumber.stepDef;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import net.serenitybdd.core.Serenity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by arun on 25/05/2017.
 */
public class GenericHookClass extends GenericDeclarationClass {

    @Before
    public void beforeTest(Scenario scenario) throws FileNotFoundException, IOException{

        for(String s:scenario.getSourceTagNames()){
            System.out.println("Tag: " +s);
        }
        prop = new Properties();
        prop.load(new FileInputStream(ConfigPath));



        //FirefoxProfile myProfile = new ProfilesIni().getProfile("SerenityBDD");
        //		myprofile.setPreference("network.proxy.type", 5);
        // 		myprofile.setPreference("browser.cache.disk.enable", false);
        // 		myprofile.setPreference("browser.cache.memory.enable", false);
        // 		myprofile.setPreference("browser.cache.offline.enable", false);
        // 		myprofile.setPreference("network.http.use-cache", false);
        // 		myprofile.setPreference("http.response.timeout", 30);
        // 		myprofile.setPreference("dom.max_script_run_time", 30);
        // 		myprofile.setPreference("network.http.connection-timeout", 10);
        // 		myprofile.setPreference("network.http.connection-retry-timeout", 10);
        //Serenity.useFirefoxProfile(myProfile);


    }

}
