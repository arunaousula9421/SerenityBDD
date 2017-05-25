package net.serenity.bdd.junit.cucumber.pages;

import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

/**
 * Created by arun on 25/05/2017.
 */
public class LoginPage extends GenericPageObject {

    @FindBy(xpath="//a[@id='login-button']")
    private WebElementFacade LoginButton;

    @FindBy(xpath="//input[@id='login-email']")
    private WebElementFacade loginEmailField;

    @FindBy(xpath="//input[@id='login-password']")
    private WebElementFacade loginPasswordField;

    @FindBy(xpath="//button[@type='submit']")
    private WebElementFacade loginSubmitButton;


    public void openHomePage_PO(){
        open();
    }

    public void performLogin(LoginData dp) {
        System.out.println("Logging in using:"+  dp.getUserName() +";" + dp.getPassword());
        LoginButton.click();
        loginEmailField.sendKeys(dp.getUserName());
        loginPasswordField.sendKeys(dp.getPassword());
        loginSubmitButton.click();

    }



}
