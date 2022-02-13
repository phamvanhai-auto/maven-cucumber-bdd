package bankGuru.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Then;
import cucumberOptions.Hooks;
import junit.framework.Assert;
import pageUIs.bankGuru.HomePageUI;

public class HomePageSteps extends BasePage{
	WebDriver driver;
	
	public HomePageSteps() {
		driver = Hooks.openAndQuitBrowser();
	}

	@Then("^Home page displayed$")
	public void homePageDisplayed() {
		waitForElementVisible(driver, HomePageUI.WELCOME_MESSAGE);
		Assert.assertEquals(getElementText(driver, HomePageUI.WELCOME_MESSAGE), "Welcome To Manager's Page of Guru99 Bank");
		Assert.assertTrue(isElementDisplayed(driver, HomePageUI.WELCOME_MESSAGE));
	}
}
