package pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 extends BasePage{

	@FindBy(xpath="//input[@id='username']")
	public static WebElement email;
	@FindBy(xpath="//input[@id='password']")
	public static WebElement password;
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	public static WebElement signin;
	
	
	public LoginPage1() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public static void credentials(String userName, String password2) {
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		email.sendKeys(userName);
		password.sendKeys(password2);
	}
	public static void clickonsignin() {
		signin.click();
	}
		

}
