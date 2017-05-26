package net.serenity.bdd.junit.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
//import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class AccountsPage extends GenericPageObject{
	
	
	@FindBy(xpath="//a[@title='E-mail']")
	private WebElement InboxLink;

	
	//thirdPartyFrame_home
	
	
	public boolean isInBoxLinkPresent(){
		getDriver().switchTo().frame("thirdPartyFrame_home");
		return(InboxLink.isDisplayed());
	}
}
