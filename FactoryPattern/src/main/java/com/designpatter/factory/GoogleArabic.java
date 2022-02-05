package com.designpatter.factory;

import org.openqa.selenium.WebDriver;

public class GoogleArabic extends GoogleEnglish {

	public GoogleArabic(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void launchSite() {
		// TODO Auto-generated method stub
		driver.get("https://www.google.com/?hl=ar");
		
	}
	@Override
	public void search(String keyword) {
		// TODO Auto-generated method stub
		super.search(keyword);
		
		
	}


}
