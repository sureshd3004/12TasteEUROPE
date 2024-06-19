package taste.PageActions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import taste.TestBase.BaseClass;
import taste.Utility.Fetchelement;

public class CartPageAction {
	Fetchelement ele = new Fetchelement();

	By checkout = By.xpath("//a[@class='btn btn-lg btn-primary rounded-pill my-4 checkout w-100 checkout-button button alt wc-forward']");
	By product = By.xpath("//div[@class='list-view-item-title']");
	By currency = By.xpath("//span[@class='woocommerce-Price-currencySymbol']");
	By weight = By.xpath("//div[@class='cart_totals cart-info calculated_shipping']/p");
	By del = By.xpath("//i[@class='icon anm anm-trash-ar']");
	By Countinueshop = By.xpath("//a[@class='btn rounded-pill btn-outline-primary btn-sm cart-continue']");
	By clearCart = By.xpath("//a[@class='btn rounded-pill btn-outline-primary btn-sm small-hide']");
	By cart = By.xpath("//a[@class='header-cart btn-minicart icon-link clr-none d-flex']//span[@class='iconCot']");


	public void cartproduct() {
		BaseClass.driver.get("https://dev.12taste.com/cart");
		ele.takeElement(cart).click();
		String proname = ele.takeElement(product).getText();
		Assert.assertEquals(true, proname.length()>0);
	}
	public void currency() {
		WebElement list = ele.takeElement(currency);
		//	for (WebElement webElement : list) {
		Assert.assertEquals("€", list.getText());
	}
	public void cartWeight() {
		String text = ele.takeElement(weight).getText();
		Assert.assertEquals(text.contains("kg"),true);
	}
	public void delete() {
		ele.takeElement(del).click();
		String proname = ele.takeElement(product).getText();
		Assert.assertEquals(proname.length()==0, false);
	}
	public void clearCart() {
		String exp = ele.takeElement(clearCart).getAttribute("href");
		Assert.assertEquals("https://dev.12taste.com/cart/?empty-cart=true",exp);
	}
	public void countinueshop() {
		String exp = ele.takeElement(Countinueshop).getAttribute("href");
		Assert.assertEquals("https://dev.12taste.com/all-products/",exp);
	}
	public void checkout() {	
		Assert.assertEquals("https://dev.12taste.com/checkout/", ele.takeElement(checkout).getAttribute("href"));
	}
}
