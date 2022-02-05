package strategyPattern.strategyPattern;

import java.util.Map;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.collections.Maps;

public class PaymentScreenTest extends BaseTest {
	
	private PaymentScreen paymentScreen;
	@BeforeTest
	public void setPaymentScreen() {
		this.paymentScreen=new PaymentScreen(this.driver);
	}
	@Test(dataProvider="getData")
	public void paymentTest(PaymentOption paymentOption,Map<String,String> paymentDetails) {
		paymentScreen.goTo();
		paymentScreen.getUserInformation().enterUserDetails("Sufail", "S", "dds@gmail.com");
		paymentScreen.setPaymentOption(paymentOption);
		paymentScreen.pay(paymentDetails);
		String orderNumber=paymentScreen.getOrder().placeOrder();
		System.out.println(orderNumber);
		
	}
	
	@DataProvider
	public Object[][] getData(){
		Map<String,String>cc=Maps.newHashMap();
		cc.put("cc", "46346");
		cc.put("year", "463763546");
		cc.put("cvv", "467753346");
		
		Map<String,String>nb=Maps.newHashMap();
		nb.put("bank", "HDFC");
		nb.put("account", "myydyey");
		nb.put("pin", "999");
		return new Object[][] {
			{new CreditCard(),cc},
			{new NetBanking(),nb}
			
			
		};
		
	}
	
	
	
	
	
	

}
