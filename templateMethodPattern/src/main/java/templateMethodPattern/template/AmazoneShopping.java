package templateMethodPattern.template;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazoneShopping extends ShoppingTemplate {
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchBox;
	@FindBy(id="nav-search-submit-button")
	private WebElement searchBtn;
	@FindBy(xpath="(//*[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement productSelectText;
	@FindBy(xpath="(//*[text()='   Currently unavailable.             '])")
	private WebElement buytxt;
	

	private WebDriver driver;
	private WebDriverWait wait;
	private String product;
	public AmazoneShopping(WebDriver driver,String product) {
		this.driver = driver;
		this.product=product;
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	

	@Override
	public void launchSite() {
		// TODO Auto-generated method stub
		driver.get("https://www.amazon.com/");
		
	}

	@Override
	public void searchProduct(String productName) {
		// TODO Auto-generated method stub
		searchBox.sendKeys(productName);
		searchBtn.click();
		
		
	}

	@Override
	public void selectProduct() {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.visibilityOf(productSelectText));
		productSelectText.click();
		
	}

	@Override
	public String buy() {
		// TODO Auto-generated method stub
		wait.until(ExpectedConditions.visibilityOf(buytxt));
		return buytxt.getText();
		
	}

}
