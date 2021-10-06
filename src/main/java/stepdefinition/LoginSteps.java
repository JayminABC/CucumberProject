package stepdefinition;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage1;

public class LoginSteps extends BasePage{
	
	LoginPage1 LP;
	HomePage HP;

	public LoginSteps() throws IOException {

	}

	@Given("Browser is open")
	public void browser_is_open() throws IOException {
		openBrowser();
		

	}

	@Given("User is on Login Page of Walmart")
	public void user_is_on_login_page_of_walmart() throws IOException {
		openUrl();
	   
	}
	

	@When("^User Enter UserName \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_Enter_UserName_and_Password(String arg1, String arg2) throws Throwable {
	LP = new LoginPage1();
	   LP.credentials(arg1, arg2);
	}

	
	@When("User Click on Sign In buttton")
	public void user_click_on_sign_in_buttton() {
		LP.clickonsignin();
	 
	}

	@Then("User Should be on Home Page")
	public void user_should_be_on_home_page() throws IOException {
		HP = new HomePage();
		HP.validatehomepage();
		closebrowser();
	}

}
