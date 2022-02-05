package strategyPattern.strategyPattern;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCard implements PaymentOption {
	@FindBy(id="cc")
	private WebElement cc;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(id="cvv")
	private WebElement CVV;

	public void enterPaymentOption(Map<String, String> paymentDetails) {
		// TODO Auto-generated method stub
		cc.sendKeys(paymentDetails.get("cc"));
		year.sendKeys(paymentDetails.get("year"));
		CVV.sendKeys(paymentDetails.get("cvv"));
		
	}

}
