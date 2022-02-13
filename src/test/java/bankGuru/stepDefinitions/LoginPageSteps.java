package bankGuru.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import pageUIs.bankGuru.LoginPageUI;

public class LoginPageSteps extends BasePage{
	WebDriver driver;
	static String loginPageUrl;
	
	public LoginPageSteps() {
		driver = Hooks.openAndQuitBrowser();
	}
	
	@Given("^Get login page Url$")
	public void getLoginPageUrl() {
		loginPageUrl = getPageUrl(driver);
	}
	
	@When("^Open Register page$")
	public void openRegisterPage() {
		waitForElementClickable(driver, LoginPageUI.HERE_LINK);
		clickToElement(driver, LoginPageUI.HERE_LINK);
	}
	
	@When("^Submit valid info to Login form$")
	public void submitValidInfoToLoginForm() {
		waitForElementVisible(driver, LoginPageUI.USER_ID_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.USER_ID_TEXTBOX, RegisterPageSteps.userID);
		
		waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXTBOX);
		sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXTBOX, RegisterPageSteps.password);
		
		waitForElementClickable(driver, LoginPageUI.LOGIN_BUTTON);
		clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
	}
}
