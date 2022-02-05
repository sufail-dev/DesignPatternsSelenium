package strategyPattern.strategyPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;
	
	@BeforeTest
	public void setupDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	
	
	

}
