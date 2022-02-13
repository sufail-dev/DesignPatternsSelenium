package commandDesignPattern.tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commandDesignPattern.base.BaseTest;
import commandDesignPattern.commandDesignPattern.HomePage;
import junit.framework.Assert;

public class HomePageTest extends BaseTest {
	
	private HomePage homePage;
	@BeforeTest
	public void setHomePage() {
		homePage=new HomePage(driver);
		
	}
	@Test
	public void dismissalTest() {
		homePage.NavigateTo();
	int count=	homePage.getDismissalAlertValidator().size();
	for(int i=0;i<count;i++) {
		Assert.assertTrue(homePage.getDismissalAlertValidator().get(i).validate());
		
	}
//	homePage.getDismissalAlertValidator().stream()
//	.map(ev->ev.validate()).forEach(b->Assert.assertTrue(b));
//	
	
	
	
		
	}

}
