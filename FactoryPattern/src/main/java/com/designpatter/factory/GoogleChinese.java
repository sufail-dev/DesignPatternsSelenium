package com.designpatter.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleChinese extends GoogleEnglish {
	
	@FindBy(xpath="//div[@id='SIvCob']//a[1]")
	private WebElement chinese;
	
	
	

	public GoogleChinese(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void launchSite() {
		// TODO Auto-generated method stub
		driver.get("https://www.google.com.hk/");
		chinese.click();
	}


}
