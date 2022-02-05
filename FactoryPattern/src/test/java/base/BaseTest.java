package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

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
