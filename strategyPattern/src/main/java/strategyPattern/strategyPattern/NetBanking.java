package strategyPattern.strategyPattern;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NetBanking implements PaymentOption {
	
	@FindBy(id="bank")
	private WebElement bank;
	@FindBy(id="acc_number")
	private WebElement account;
	@FindBy(id="pin")
	private WebElement pin;
	
	
	public void NetBaning(final WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	

	public void enterPaymentOption(Map<String, String> paymentDetails) {
		// TODO Auto-generated method stub
		Select bankDropdown=new Select(bank);
		bankDropdown.selectByValue(paymentDetails.get("bank"));
		account.sendKeys(paymentDetails.get("account"));
		pin.sendKeys(paymentDetails.get("pin"));
		
	}

}
