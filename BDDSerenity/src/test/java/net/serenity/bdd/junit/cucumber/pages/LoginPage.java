package net.serenity.bdd.junit.cucumber.pages;

import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
//import net.serenitybdd.core.pages.WebElementFacadeImpl;
//import net.serenitybdd.core.pages.WebElementFacade;
//import org.openqa.selenium.WebElement;

/**
 * Created by arun on 25/05/2017.
 */
public class LoginPage extends GenericPageObject {

    @FindBy(xpath="//a[@id='login-button']")
    private WebElement LoginButton;

    @FindBy(xpath="//input[@id='login-email']")
    private WebElement  loginEmailField;

    @FindBy(xpath="//input[@id='login-password']")
    private WebElement  loginPasswordField;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement  loginSubmitButton;


    public void openHomePage_PO(){
        open();
    }

    public void performLogin(LoginData dp) {
        LoginButton.click();
        loginEmailField.sendKeys(dp.getUserName());
        loginPasswordField.sendKeys(dp.getPassword());
        loginSubmitButton.click();

    }



}
