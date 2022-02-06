package commandDesignPattern.commandDesignPattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import com.google.common.util.concurrent.Uninterruptibles;

public class NotificationValidator extends ElementValidatorAbstract{

	private final WebElement button;
	private final WebElement notification;
	
	public NotificationValidator(final WebElement button, final WebElement notification) {
		this.button=button;
		this.notification=notification;
	}
	
	
	
	
	
	@Override
	public boolean validate() {
		button.click();
		boolean appearanceState=notification.isDisplayed();
		Uninterruptibles.sleepUninterruptibly(4,TimeUnit.SECONDS);
		boolean disappearanceState=notification.isDisplayed();
		return appearanceState && (!disappearanceState);
	
	}

}
