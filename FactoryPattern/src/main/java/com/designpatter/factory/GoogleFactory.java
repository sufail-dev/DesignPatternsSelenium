package com.designpatter.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;

public class GoogleFactory {
	
	
	public WebDriver driver;
	
	public static final Function<WebDriver,GooglePage> ENG=(d)->new GoogleEnglish(d);
	public static final Function<WebDriver,GooglePage> CHN=(d)->new GoogleChinese(d);
	public static final Function<WebDriver,GooglePage> AR=(d)->new GoogleArabic(d);
	public static final Map<String, Function<WebDriver,GooglePage>> MAP=new HashMap<>();
	static {
		MAP.put("ENG", ENG);
		MAP.put("CHN", CHN);
		MAP.put("AR", AR);	
	}
	
	public static GooglePage get(String language,WebDriver driver) {
		return MAP.get(language).apply(driver);
	}
	
	

}
