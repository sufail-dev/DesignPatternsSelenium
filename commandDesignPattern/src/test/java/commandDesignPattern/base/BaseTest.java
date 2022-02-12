package commandDesignPattern.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public WebDriver driver;
	@BeforeTest
	public void setupDriver() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriverexe\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterTest
	public void quiteBrowser() {
		driver.quit();
	}
	

}
