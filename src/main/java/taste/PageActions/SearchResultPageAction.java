package taste.PageActions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import junit.framework.Assert;
import taste.TestBase.BaseClass;
import taste.Utility.Fetchelement;

public class SearchResultPageAction {

	Fetchelement ele = new Fetchelement();
	Select select; 
	By applicationArea =  By.xpath("//select[@name='filter_application']");

	By searchresult= By.xpath("//span[@class='toolbar-product-count']");

	By searchbox = By.xpath("//input[@id='dgwt-wcas-search-input-2']");

	By diet_label = By.xpath("//*[@id=\"dietary_form\"]/ul/li/label");

	By applyFilter = By.xpath("//button[@type='submit'][normalize-space()='Apply Filters']");

	By viewAs = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/div/div[1]/div/div/a");

	By sort = By.xpath("//select[@id='sortby-select']");


	public void search2() {
		BaseClass.driver.get("https://dev.12taste.com/?s=nutek&post_type=product&dgwt_wcas=1");
		Assert.assertEquals("9 results found matching \"nutek\"" , ele.takeElement(searchresult).getText());
	}
	public void filterApplication() throws InterruptedException {
		WebElement elem = ele.waitandTakeelement(applicationArea);
		select = new Select(elem);
			select.selectByIndex(5);
		//System.out.println("app"+select.getOptions().size());
}
	public void filterDiet_label() throws InterruptedException {
		List<WebElement> list = ele.waitandTakeelements(diet_label);
		for (WebElement webe : list) {	
			webe.click();
			Thread.sleep(2345);
		}}
	public void viewAs() {
		for (WebElement list : ele.takeListElement(viewAs)) {
			ele.waitAndClick(list);
		}}
	public void sort() throws InterruptedException {
		select = new Select(ele.takeElement(sort));
			select.selectByIndex(2);
		//	System.out.println("s"+select.getOptions().size());
		}
}