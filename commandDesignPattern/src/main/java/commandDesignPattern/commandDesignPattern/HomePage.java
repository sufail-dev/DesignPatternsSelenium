package commandDesignPattern.commandDesignPattern;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private final WebDriver driver;
	
	@FindBy(css="div.button-box button.btn-info")
	private WebElement infoBtn;
	@FindBy(css="div.button-box button.btn-warning")
	private WebElement warningBtn;
	@FindBy(css="div.button-box button.btn-success")
	private WebElement successBtn;
	@FindBy(css="div.button-box button.btn-danger")
	private WebElement dangerBtn;
	@FindBy(css="div.jq-icon-info")
	private WebElement infoAlert;
	@FindBy(css="div.jq-icon-warning")
	private WebElement warningAlert;
	@FindBy(css="div.jq-icon-success")
	private WebElement successAlert;
	@FindBy(css="div.jq-icon-error")
	private WebElement errorAlert;
	
	@FindBy(css="div.alert-info")
	private WebElement infoDismissBtn;
	
	@FindBy(css="div.alert-success")
	private WebElement successDismissBtn;
	
	@FindBy(css="div.alert-danger")
	private WebElement dangerDismissBtn;
	
	@FindBy(css="div.alert-warning")
	private WebElement warningDismissBtn;
	
	
	
	
	public HomePage(final WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void NavigateTo() {
		driver.get("http://wrappixel.com/demos/admin-templates/admin-pro/main/ui-notification");
	}
	
	public List<ElementValidatorAbstract> getElementValidators(){
		
		return Arrays.asList(
				new NotificationValidator(infoBtn,infoAlert),
				new NotificationValidator(warningBtn,warningAlert),
				new NotificationValidator(successBtn,successAlert),
				new NotificationValidator(dangerBtn,errorAlert)
				
				
				);
		
		
	}
	
	
	

}
