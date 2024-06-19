package taste.Runner;

import org.testng.annotations.Test;

import taste.PageActions.ProductPageActions;
import taste.TestBase.BaseClass;

public class ProductPageTest extends BaseClass{


	ProductPageActions product = new ProductPageActions();
	@Test(priority = 11)
	public void ProductpageTest1() {

		logger.info("shortDiscription test");
		product.Checkshortdiscription();
	}	
	@Test(priority = 12)
	public void ProductpageTest2() {
		logger.info("categories test");
		product.Categories();
	}	
	@Test(priority = 13)
	public void ProductpageTest3() {
		logger.info("longDiscription test");
		product.Checkdiscription();
	}	
	@Test(priority = 14)
	public void ProductpageTest4() {
		product.FourOptions();
		logger.info("fouroptions test");
	}	
	@Test(priority = 15)
	public void ProductpageTest5() {
		product.eta();
	}	
	@Test(priority = 16)
	public void ProductpageTest6() {
		logger.info("variation test");
		product.variation();
	}	
	@Test(priority = 17)
	public void ProductpageTest7() {
		logger.info("vendor test");
		product.vendor();
	}
	@Test(priority = 18)
	public void ProductpageTest8() {
		logger.info("cart test");
		product.cart();
	}
	@Test(priority = 19)
	public void ProductpageTest9() {
		logger.info("quote test");
		product.quote();
	}
}
