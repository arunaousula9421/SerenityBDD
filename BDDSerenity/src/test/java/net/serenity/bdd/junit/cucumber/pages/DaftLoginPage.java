package net.serenity.bdd.junit.cucumber.pages;

import net.serenity.bdd.junit.cucumber.model.DaftLoginData;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

/**
 * Created by arunkumar on 26-05-2017.
 */
@DefaultUrl("http://daft.ie")
public class DaftLoginPage extends GenericPageObject {

    @FindBy(xpath = "//img[@class='main-logo ng-scope']")
    private WebElement daftLogo;

    @FindBy(xpath="//li[1]/a[contains(text(),'Login to MyDaft')]")
    private WebElement loginLink;

    @FindBy(xpath = "//span[@class='login_head']")
    private WebElement signInPage;

    @FindBy(xpath ="//input[@id = 'auth_username']")
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id = 'auth_password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id = 'login_button']")
    private WebElement loginButton;

    @FindBy(xpath = "//li/a[contains(text(),'Saved properties')]")
    private WebElement savedPropertiesOption;



    public void openDaftPage_PO(){
        open();
    }

    public void daftLaunched(){
        daftLogo.isDisplayed();
    }

    public void verifyLoginLink(){
        loginLink.isDisplayed();
    }

    public void clickLoginLink(){
        loginLink.click();
    }

    public void verifyLoginPage(){
        signInPage.isDisplayed();
    }

    public void enterUsername(DaftLoginData daftComposerData){
        usernameField.click();
        usernameField.sendKeys(daftComposerData.getUsername());
    }

    public  void enterPassword(DaftLoginData daftComposerData){
        passwordField.sendKeys(daftComposerData.getPassword());
    }

    public void clickLoginButton(){
        loginButton.click();
    }

    public void savedProperties(){
        Assert.assertTrue(savedPropertiesOption.isDisplayed());
    }
}
