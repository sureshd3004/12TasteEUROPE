package taste.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import taste.TestBase.BaseClass;
import taste.Utility.Fetchelement;

public class ProductPageActions {
	//WebElement vendor;
	Fetchelement ele = new Fetchelement();
	
	By wishlist = By.xpath("//span[text()='Add to my portfolio']");
    By Discription =By.xpath("//*[@id=\"description\"]/div");
    By shortdiscription = By.xpath("//div[@class=\"woocommerce-product-details__short-description\"]/p/span");
    By quote = By.xpath("//button[normalize-space()='Add to quote']");
    By fourdownoptions = By.xpath("//a[@class=\"tablink\"]");
    By cart = By.xpath("//button[normalize-space()='Add to cart']");
    By vendorr = By.xpath("//span[@class='text ps-0']//a[contains(text(),'Selectarome')]");
    By quantity = (By.xpath("//a[@class='qtyBtn plus']"));
    By cartbtn = By.xpath("//button[normalize-space()='Add to cart']");
    By Quotebtn = By.xpath("//div[@class='product-form-submit buyit fl-1 me-3']//a[@class='add-request-quote-button button'][normalize-space()='Request a quote']");
    By vaiationlist = By.xpath("//tbody/tr/td/label[1]/span");
	By categories = By.xpath("//*[@id=\"product-4875497\"]/div[2]/div[1]/div[2]/div/div[4]/div/span[2]/a");
	By eta = By.xpath("//span[@class='eta-html']");
	
	public void addWishlist() {
		WebElement wish = ele.takeElement(wishlist);
		ele.scroll(wish);
		ele.waitToLoad(wishlist);
		wish.sendKeys(Keys.ENTER);
	}
	public void Checkdiscription() {
		String discrption = ele.takeElement(Discription).getText();
		Assert.assertEquals(true,  discrption.length() > 0);
	}	
	public void Checkshortdiscription() {
		BaseClass.driver.get("https://dev.12taste.com/product/selectarome-banane-bio-ba-0125/");
		String discrption = ele.takeElement(shortdiscription).getText();
		Assert.assertEquals(true, discrption.length() > 0);
	}	
	public void FourOptions() {
		boolean bool = ele.takeElement(fourdownoptions).isDisplayed();
		Assert.assertEquals(true, bool);
	}
	public void vendor() {
		boolean vendor = ele.takeElement(vendorr).isDisplayed();
		Assert.assertEquals(true, vendor);
	}
	public void Categories() {
		boolean bool = ele.takeElement(categories).isDisplayed();
		Assert.assertEquals(true, bool);
	}
	public void eta() {
		boolean bool = ele.takeElement(eta).isDisplayed();
		Assert.assertEquals(true, bool);
	}
	public void variation() {
		boolean bool = ele.takeElement(vaiationlist).isEnabled();
		Assert.assertEquals(true, bool);
	}
	public void cart() {
	WebElement cartt = ele.takeElement(cart);
		boolean status = cartt.isEnabled();
		Assert.assertEquals(true, status);
		cartt.sendKeys(Keys.ENTER);	
	}
	public void quote() {
		WebElement quotee = ele.takeElement(quote);
		boolean status = quotee.isEnabled();
		Assert.assertEquals(true, status);
	}
}
