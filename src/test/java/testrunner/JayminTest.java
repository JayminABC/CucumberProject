package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Selenium_Practice\\CucumberBDDMvnWalmart\\src\\main\\java\\AppFeatures\\Login1.feature",
		glue = {"stepdefinition"},
		plugin = {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome = true,
		dryRun = false,
		strict = true
		
		//tags = {"@saity , @regression"}
		
		)
public class JayminTest {

}
