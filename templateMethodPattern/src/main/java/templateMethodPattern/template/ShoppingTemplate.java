package templateMethodPattern.template;

public abstract class ShoppingTemplate {
	public abstract void launchSite();
	public abstract void searchProduct(String a);
	public abstract void selectProduct();
	public abstract String buy();
	
	public void shop() {
		launchSite();
		searchProduct(null);
		selectProduct();
		buy();
	}
	
}
