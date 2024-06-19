package taste.Runner;

import org.testng.annotations.Test;

import taste.PageActions.CartPageAction;
import taste.TestBase.BaseClass;

public class CartPageTest extends BaseClass{
	
        CartPageAction cart = new CartPageAction();
        @Test()
    	public void CartpageTest1() {
    		logger.info("cart product name test");
    		cart.cartproduct();
    	}
    	@Test()
    	public void CartpageTest2() {
    		logger.info("cart weight test");
    		cart.cartWeight();
    	}
    	@Test()
    	public void CartpageTest3() {
    		logger.info("Price And Currency test");
    		cart.currency();
    	}
    	@Test()
    	public void CartpageTest4() {
    		logger.info("clear Cart test");
    		cart.clearCart();
    	}
    	@Test()
    	public void CartpageTest5() {
    		logger.info("countinue shop test");
    		cart.countinueshop();
    	}
    	@Test()
    	public void CartpageTest6() {
    		logger.info("delete test");
    		cart.delete();
    	}                   
}
