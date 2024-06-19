package taste.PageActions;

import org.openqa.selenium.By;
import org.testng.Assert;

import taste.Utility.Fetchelement;

public class MywishlistActions {
        Fetchelement ele = new Fetchelement();
        
        By wishlist = By.xpath("//i[@class='hdr-icon icon anm anm-heart-l']");
        
        By Price = By.xpath("//span[@class='woocommerce-Price-amount amount']");
        
        By remove = By.xpath("//a[@class='remove_from_wishlist button']");
        By removetext = By.xpath("//div[@class='woocommerce-message']"); 
        
        public void wishlist() {
			ele.takeElement(wishlist).click();
			Assert.assertEquals("My Portfolio | 1-2-Taste", ele.titlt());
		}
        public void Price() {
			Assert.assertEquals(true, ele.takeElement(Price).getText().contains("€"));
		}
        public void remove() {
        	ele.takeElement(remove).click();    
			Assert.assertEquals("Product successfully removed.",ele.takeElement(removetext).getText());
		}
        
}
