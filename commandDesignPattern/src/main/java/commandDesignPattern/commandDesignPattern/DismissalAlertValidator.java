package commandDesignPattern.commandDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DismissalAlertValidator extends ElementValidatorAbstract {
	private final WebElement dismissAlertButton;
	public DismissalAlertValidator(final WebElement dismissAlertButton ) {
		this.dismissAlertButton=dismissAlertButton;
	}

	@Override
	public boolean validate() {
		boolean beforeClose=dismissAlertButton.isDisplayed();
		dismissAlertButton.findElement(By.cssSelector("button.close")).click();
		boolean afterClose=dismissAlertButton.isDisplayed();
		return beforeClose && (!afterClose);
		
	}
}
