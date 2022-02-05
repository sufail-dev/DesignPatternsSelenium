package com.designpatter.factory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleEnglish extends GooglePage {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy(name="q")
	private WebElement searchBox;
	@FindBy(name="btnK")
	private WebElement searchBtn;
	@FindBy(xpath="//div[@class='tF2Cxc']")
	private List<WebElement> results;
	
	public  GoogleEnglish(final WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver,30);
		PageFactory.initElements(driver, this);
	}
	
	

	@Override
	public void launchSite() {
		// TODO Auto-generated method stub
		driver.get("https://www.google.com");
	}

	@Override
	public void search(String keyword) {
		// TODO Auto-generated method stub
		searchBox.sendKeys(keyword);
		wait.until((d)->searchBtn.isDisplayed());
		searchBtn.click();
		
		
	}

	@Override
	public void getCountResult() {
		// TODO Auto-generated method stub
		wait.until((d)->results.size()>1);
		
	}

}
