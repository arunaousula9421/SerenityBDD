package net.serenity.bdd.junit.cucumber.pages;

import net.serenity.bdd.junit.cucumber.model.ComposeData;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

/**
 * Created by arun on 26/05/2017.
 */
@DefaultUrl("https://www.mail.com/int/")
public class ComposePage extends GenericPageObject {

    @FindBy(xpath="//a[@title='Compose E-mail']")
    private WebElement composeLink;

    @FindBy(xpath= "//li[@class='select2-search-field']/input")
    private WebElement toField;

    @FindBy(xpath= "//input[@class='mailobjectpanel-textfield_input']")
    private WebElement subjectField;

    @FindBy(xpath = "//button[@name='composeHeader:buttonSend']")
    private WebElement sendButton;

    @FindBy(xpath = "//iframe[@class='cke_wysiwyg_frame cke_reset']")
    private WebElement bodyField;



    public void composeEmail(ComposeData composeDataProvider) {
        composeLink.click();
        getDriver().switchTo().defaultContent();
        getDriver().switchTo().frame("thirdPartyFrame_mail");
        toField.click();
        toField.sendKeys(composeDataProvider.getToAddress());
        subjectField.click();
        subjectField.sendKeys(composeDataProvider.getSubject());
        bodyField.click();
        bodyField.click();
        bodyField.sendKeys(composeDataProvider.getBody());
        sendButton.isEnabled();
        sendButton.click();
    }

    public void checkForSuccessMail(){
        waitForAnyTextToAppear("E-mail sent successfully!");
    }

}
