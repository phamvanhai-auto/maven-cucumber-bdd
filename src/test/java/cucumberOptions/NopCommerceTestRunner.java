package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\nopCommerce\\features",
		glue = "nopCommerce.stepDefinitions",
		monochrome = true,
		plugin = { "pretty", "html:target/site/cucumber-report-default", "json:target/site/cucumber.json"},
		snippets = SnippetType.CAMELCASE,
		tags = { "@login_datatable" })

public class NopCommerceTestRunner {

}
