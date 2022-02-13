package bankGuru.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageUIs.bankGuru.RegisterPageUI;
import utilities.DataUtil;

public class RegisterPageSteps extends BasePage{
	WebDriver driver;
	static String userID, password;
	DataUtil dataTest;
		
	public RegisterPageSteps() {
		driver = Hooks.openAndQuitBrowser();
		dataTest = DataUtil.getData();
	}
	
	@When("^Input to Email textbox$")
	public void inputToEmailTextbox() {
		waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXTBOX);
		sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXTBOX, dataTest.getEmailAddress());
	}

	@When("^Click to Submit button$")
	public void clickToSubmitButton() {
		waitForElementClickable(driver, RegisterPageUI.SUBMIT_BUTTON);
		clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
	}

	@Then("^Get User and password info$")
	public void getUserAndPasswordInfo() {
		waitForElementVisible(driver, RegisterPageUI.USER_ID_TEXT);
		userID = getElementText(driver, RegisterPageUI.USER_ID_TEXT);
		
		waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXT);
		password = getElementText(driver, RegisterPageUI.PASSWORD_TEXT);
	}

	@When("^Back to Login page$")
	public void backToLoginPage() {
		openUrl(driver, LoginPageSteps.loginPageUrl);
	}

}
