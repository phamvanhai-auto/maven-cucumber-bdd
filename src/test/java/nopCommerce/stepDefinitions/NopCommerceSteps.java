package nopCommerce.stepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NopCommerceSteps {
	WebDriver driver;

	//@Given("^Open NopCommerce Admin$")
	@Before
	public void openNopCommerceAdmin() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Then("^Input to Email textbox with \"([^\"]*)\"$")
	public void inputToEmailTextboxWith(String emailAddr) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(emailAddr);
	}

	@Then("^Input to Password textbox with \"([^\"]*)\"$")
	public void inputToPasswordTextboxWith(String password)  {
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);
	}
	
    @Then("^Input to Email and Password$")
    public void input_to_email_and_password(DataTable table) {
//        List<Map<String, String>> customer = table.asMaps(String.class, String.class);
//        
//		driver.findElement(By.id("Email")).clear();
//		driver.findElement(By.id("Email")).sendKeys(customer.get(0).get("Email"));
//		
//		driver.findElement(By.id("Password")).clear();
//		driver.findElement(By.id("Password")).sendKeys(customer.get(0).get("Password"));
		
		for (Map<String, String> loginInfo : table.asMaps(String.class, String.class)) {
			driver.findElement(By.id("Email")).clear();
			driver.findElement(By.id("Email")).sendKeys(loginInfo.get("Email"));
			
			driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("Password")).sendKeys(loginInfo.get("Password"));
		}
        
    }
    
	@Then("^Input to Email textbox with \"([^\"]*)\" and Password textbox with \"([^\"]*)\"$")
	public void inputToEmailTextboxWithAndPasswordTextboxWith(String emailAddr, String password) {
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys(emailAddr);
		
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys(password);
		
	}
	
	//@And("^Close app$")
	@After
	public void close_app() {
		driver.quit();

	}
}
