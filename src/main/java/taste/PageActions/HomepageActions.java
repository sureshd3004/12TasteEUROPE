package taste.PageActions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import taste.TestBase.BaseClass;
import taste.Utility.Fetchelement;

public class HomepageActions {
	
	Fetchelement ele = new Fetchelement();
	Actions action;

	By searchbox = By.xpath("//input[@id='dgwt-wcas-search-input-1']");
	By myaccount = By.xpath("//a[@title='My Account']//span[@class='iconCot']");
	By uRLs = By.tagName("a");
	By laung = By.xpath( "//*[@id=\"gt-wrapper-63180185\"]/a");
	By blogs = By.xpath("//*[@id=\"page-content\"]/div[4]/div/div/div[2]/div/a[1]");
	By podcasts = By.xpath("//*[@id=\"page-content\"]/div[4]/div/div/div[2]/div/a[2]");
	By searchsby = By.xpath("\"//*[@id=\\\"accordionFaq-97\\\"]/div/div\"");
	By buying = By.xpath("//span[@class='text']");
	By ingredientsoptions = By.xpath("//*[@id=\"menu-ingredients-menu\"]/li");
	
	public void myaccount() {
		ele.takeElement(myaccount).click();
	}
	public void title() {
		String title = BaseClass.driver.getTitle();
		Assert.assertEquals("1-2-Taste - Quality ingredients for food and beverage innovators | 1-2-Taste", title);
	}
	public void search() {
		WebElement search = ele.takeElement(searchbox);
		search.sendKeys("mango");
		search.sendKeys(Keys.ENTER);
	}
	public void homepageurls() {
		int size = ele.takeListElement(uRLs).size();
		Assert.assertEquals(300, size);
	}
	public void launguage() {
		List<WebElement> list = ele.takeListElement(laung);
		for (WebElement webElement : list) {
			Assert.assertEquals(true, webElement.isEnabled());
		}}
	public void whitepaper() {
		WebElement whitepaper = ele.waitandTakeelement(By.xpath("//*[@id='page-content']/div[7]/div/div/div[2]/div/a"));
		ele.scroll(whitepaper);
		Assert.assertEquals("https://www.12taste.com/1-2-taste-whitepapers/whitepaper-5-tips-for-sustainable-food-ingredient-development/", whitepaper.getAttribute("href"));
	}
	public void Blog() {
		WebElement blog = ele.takeElement(blogs);
		Assert.assertEquals("https://dev.12taste.com/blogs/", blog.getAttribute("href"));
	}
	public void Podcast() {
		WebElement podcast = ele.takeElement(podcasts);
		Assert.assertEquals("https://www.12taste.com/1-2-taste-podcast-series/", podcast.getAttribute("href"));
	}
	public void searchBy() {
		List<WebElement> list = ele.takeListElement(searchsby);
		for (WebElement webElement : list) {
			Assert.assertEquals(true, webElement.isEnabled());
			webElement.click();
		}}
	public void buyIngrediets() {
		ele.takeElement(buying).click();
		List<WebElement> list = ele.takeListElement(ingredientsoptions);
		for (WebElement webElement : list) {
			Assert.assertEquals(true, webElement.isEnabled());
		}

	}
}
