package taste.PageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import taste.Utility.Fetchelement;

public class SellerPageActions {
	Fetchelement ele = new Fetchelement();

	By seller = By.xpath("//a[normalize-space()='Sell ingredients']");
	By download = By.xpath("//a[@class='btn btn-lg mt-md-2 rounded-pill btn-primary me-3']");

	public void sellerpage() {
		ele.takeElement(seller).click();
		Assert.assertEquals("Become a 1-2-Taste supplier | 1-2-Taste",ele.titlt());	
	}
    public void download() {
    	WebElement down =  ele.takeElement(download);
    	ele.scroll(down);
	   ele.waitToLoad(download);
	   down.sendKeys(Keys.ENTER);
}
}
