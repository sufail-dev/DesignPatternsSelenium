package strategyPattern.strategyPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInformation {
	@FindBy(id="fn")
	private WebElement firstName;
	@FindBy(id="ln")
	private WebElement lastName;

	@FindBy(id="email")
	private WebElement Email;
	public UserInformation(final WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void enterUserDetails(String firstname,String lastNmae,String email){
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastNmae);
		Email.sendKeys(email);
		
		
	}

}
