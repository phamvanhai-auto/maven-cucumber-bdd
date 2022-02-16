package bankGuru.stepDefinitions;

import org.openqa.selenium.WebDriver;

import commons.BasePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberOptions.Hooks;
import junit.framework.Assert;
import pageUIs.bankGuru.CommonPageUI;
import utilities.DataUtil;

public class CommonPageaSteps extends BasePage{
	WebDriver driver;
	DataUtil dataTest;
	String email;
	
	public CommonPageaSteps() {
		driver = Hooks.openAndQuitBrowser();
		dataTest = DataUtil.getData();
		email = dataTest.getEmailAddress();
	}
	
	@Given("^Open \"([^\"]*)\" page$")
	public void openPage(String namePage) {
	    waitForElementVisible(driver, CommonPageUI.DYNAMIC_LINK, namePage);
	    clickToElement(driver, CommonPageUI.DYNAMIC_LINK, namePage);
	    
	}

	@When("^Input to \"([^\"]*)\" textbox with value \"([^\"]*)\"$")
	public void inputToTextboxWithValue(String fieldName, String inputValue) {
		waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTBOX, fieldName);
		if(fieldName.equals("Date of Birth")) {
			removeAttributeInDOM(driver, CommonPageUI.DYNAMIC_TEXTBOX, "type", fieldName);
			SleepInSecond(1);
		}
		if(fieldName.equals("E-mail")) {
			inputValue = email;
		}
		sendKeyToElement(driver, CommonPageUI.DYNAMIC_TEXTBOX, inputValue, fieldName);
	}

	@When("^Click to \"([^\"]*)\" radio button with value \"([^\"]*)\"$")
	public void clickToRadioButtonWithValue(String fieldName, String inputValue) {
	    waitForElementVisible(driver, CommonPageUI.DYNAMIC_RADIO_BUTTON, fieldName, inputValue);
	    clickToElement(driver, CommonPageUI.DYNAMIC_RADIO_BUTTON, fieldName, inputValue);
	 
	}
	
	@When("^Input to \"([^\"]*)\" textarea with value \"([^\"]*)\"$")
	public void inputToTextareaWithValue(String fieldName, String inputValue) {
	    waitForElementVisible(driver, CommonPageUI.DYNAMIC_TEXTAREA, fieldName);
	    sendKeyToElement(driver, CommonPageUI.DYNAMIC_TEXTAREA, inputValue, fieldName);
	    
	}

	@When("^Click to \"([^\"]*)\" button$")
	public void clickToButton(String buttonName) {
	    waitForElementClickable(driver, CommonPageUI.DYNAMIC_BUTTON, buttonName);
	    clickToElement(driver, CommonPageUI.DYNAMIC_BUTTON, buttonName);
	    
	}

	@Then("^Success message displayed with \"([^\"]*)\"$")
	public void successMessageDisplayedWith(String expectedMessage) {
	    waitForElementVisible(driver, CommonPageUI.DYNAMIC_MESSAGE, expectedMessage);
	    Assert.assertTrue(isElementDisplayed(driver, CommonPageUI.DYNAMIC_MESSAGE, expectedMessage));
	   
	}

	@Then("^The valid text displayed at \"([^\"]*)\" with value \"([^\"]*)\"$")
	public void theValidTextDisplayedAtWithValue(String rowName, String expectedValue) {
	    waitForElementVisible(driver, CommonPageUI.DYNAMIC_VALUE_BY_ROW_NAME, rowName);
	    if(rowName.equals("Email")) {
	    	expectedValue = email;
	    }
	    Assert.assertEquals(getElementText(driver, CommonPageUI.DYNAMIC_VALUE_BY_ROW_NAME, rowName), expectedValue);
	     
	}

}
