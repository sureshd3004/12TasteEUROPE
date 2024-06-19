package taste.Runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import taste.PageActions.CartPageAction;
import taste.PageActions.HomepageActions;
import taste.PageActions.LoginPageActions;
import taste.PageActions.MywishlistActions;
import taste.PageActions.ProductPageActions;
import taste.PageActions.SearchResultPageAction;
import taste.PageActions.SellerPageActions;
import taste.TestBase.BaseClass;


public class TestRunner extends BaseClass{
	WebDriver driver;

	HomepageActions homepage =new HomepageActions();
	LoginPageActions loginpage = new LoginPageActions();
	ProductPageActions product = new ProductPageActions();
	SearchResultPageAction search= new SearchResultPageAction();
	MywishlistActions wishlist = new MywishlistActions();
	SellerPageActions seller = new  SellerPageActions();
	CartPageAction cart = new CartPageAction();

	@Test(priority=1)
	public void HomePageTest1() {
		logger.info("loding homepage");
		homepage.title();
	}
	@Test(priority=2)
	public void HomePageTest2() {
		logger.info("URLs testing");	
	}
	@Test(priority=3)
	public void HomePageTest9() {
		homepage.search();
		logger.info("Searchbox testing");
	}
	@Test(priority=4,enabled=false)
	public void HomePageTest4() {
		logger.info("whitepaper");
		homepage.whitepaper();
	}
	@Test(priority=5)
	public void HomePageTest5() {
		logger.info(" blog");
		homepage.Blog();
	}
	@Test(priority=6)
	public void HomePageTest6() {
		logger.info("podcast");
		homepage.Podcast();
	}
	@Test(priority=7)
	public void HomePageTest7() {
		logger.info("launguage");
		homepage.launguage();
	}
	@Test(priority=8)
	public void HomePageTest8() {
		logger.info("SearchBy");
		homepage.searchBy();
	}
	@Test(priority=9)
	public void HomePageTest3() {
		logger.info("buyIngredients");
		homepage.buyIngrediets();
	}
	@Test(priority=10)
	public void LogInpageTest1() throws InterruptedException {
		loginpage.verifyLoginPageIsLoaded();

	}
	@Test(priority=11)
	public void LogInpageTest2() throws InterruptedException {
		Thread.sleep(2234);
		loginpage.enterCredentialswrong();
	}
	@Test(priority=12)
	public void LogInpageTest3() throws InterruptedException {
		Thread.sleep(2234);
		loginpage.enterCredentialswrong1();
	}
	@Test(priority=13)
	public void LogInpageTest4() throws InterruptedException {
		Thread.sleep(2234);
		loginpage.Registerwithexistingemail();
	}
	@Test(priority=14)
	public void LogInpageTest5() throws InterruptedException {
		Thread.sleep(2234);
		loginpage.forgotPassword();
	}
	@Test(priority=15)
	public void LogInpageTest6() throws InterruptedException {
		Thread.sleep(2234);
		loginpage.Registerwithnewemail();
	}
	@Test(priority=16)
	public void LogInpageTest7() throws InterruptedException {
		Thread.sleep(2234);
		loginpage.enterCredentialscorrect();
	}
	@Test(priority=17)
	public void ProductpageTest1() {

		logger.info("shortDiscription test");
		product.Checkshortdiscription();
	}	
	@Test(priority=18)
	public void ProductpageTest2() {
		logger.info("categories test");
		product.Categories();
	}	
	@Test(priority=19)
	public void ProductpageTest3() {
		logger.info("longDiscription test");
		product.Checkdiscription();
	}	
	@Test(priority=20)
	public void ProductpageTest8() {
		product.FourOptions();
		logger.info("fouroptions test");
	}	
	@Test(priority=21)
	public void ProductpageTest5() throws InterruptedException {
		logger.info("ETA");
		Thread.sleep(2000);
		product.eta();
	}	
	@Test(priority=22)
	public void ProductpageTest6() {
		logger.info("variation test");
		product.variation();
	}	
	@Test(priority=23)
	public void ProductpageTest7() {
		logger.info("vendor test");
		product.vendor();
	}
	@Test(priority=24)
	public void ProductpageTest10() {
		logger.info("wishlist test");
		product.addWishlist();
	}
	@Test(priority=25)
	public void ProductpageTest9() {
		logger.info("cart test");
		product.cart();
	}
	@Test(priority=26)
	public void ProductpageTest4() {
		logger.info("quote test");
		product.quote();
	}
	@Test(priority=27)
	public void SearchpageTest1() {
		logger.info("search box test");
		search.search2();
	}
	@Test(priority=28)
	public void SearchpageTest2() throws InterruptedException {
		logger.info("filterApplication test");
		search.filterApplication();
	}
	@Test(priority=29)
	public void SearchpageTest3() throws InterruptedException {
		logger.info("filterDiet test");
		search.filterDiet_label();
	}
	@Test(priority=30)
	public void SearchpageTest4() throws InterruptedException {
		logger.info("sort test");
		search.sort();
	}
	@Test(priority=31)
	public void WishListpageTest1() {
		logger.info("wishlist test");
		wishlist.wishlist();
	}
	@Test(priority=32)
	public void WishListpageTest2() {
		logger.info("price test");
		wishlist.Price();
	}
	@Test(priority=33)
	public void WishListpageTest3() {
		logger.info("remove test");
		wishlist.remove();
	}
	@Test(priority=34)
	public void SearchpageTest5() {
		logger.info("viewAs test");
		search.viewAs();
	}
	@Test(priority=35)
	public void SellerpageTest1() {
		logger.info("sellerPage test");
		seller.sellerpage();
	}
	@Test(priority=36)
	public void SellerpageTest2() {
		logger.info("download test");
		seller.download();
	}
	@Test(priority=37)
	public void CartpageTest1() {
		logger.info("cart product name test");
		cart.cartproduct();
	}
	@Test(priority=38)
	public void CartpageTest2() {
		logger.info("cart weight test");
		cart.cartWeight();
	}
	@Test(priority=39)
	public void CartpageTest3() {
		logger.info("Price And Currency test");
		cart.currency();
	}
	@Test(priority=40)
	public void CartpageTest4() {
		logger.info("clear Cart test");
		cart.clearCart();
	}
	@Test(priority=41)
	public void CartpageTest5() {
		logger.info("countinue shop test");
		cart.countinueshop();
	}	@Test(priority=42)
	public void CartpageTest6() {
		logger.info("delete test");
		cart.delete();
	}                   
	@Test(priority=43)
	public void CartpageTest7() {
		logger.info("checkout test");
		cart.checkout();
	}      

}
