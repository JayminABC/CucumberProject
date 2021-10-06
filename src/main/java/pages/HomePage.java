package pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	@FindBy(xpath="//a[contains(text(),'Electronics')]")
	WebElement link;
	
	@FindBy(xpath="//span[text()='Flyers']")
	WebElement Flyer;

	public HomePage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public boolean validatehomepage() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return link.isDisplayed();
	}
	

}
