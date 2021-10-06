package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BasePage {
	 
	public static Properties prop;
	public static WebDriver driver;

	public BasePage() throws IOException {
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\walmartprop.properties");
		prop = new Properties();
		prop.load(file);
		
		
		
	}
	
	public void openBrowser() {
		String browser = prop.getProperty("browser");
		
		if (browser.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
	}
	
	public void openUrl() {
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
	}
	
	
	public void closebrowser() {
		driver.close();
	}
	
}
