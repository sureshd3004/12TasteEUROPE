package taste.Utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import taste.TestBase.BaseClass;

public class Fetchelement {

	public WebElement takeElement(By locator){
		return BaseClass.driver.findElement(locator);
	}
	public List<WebElement> takeListElement(By locator){
		return BaseClass.driver.findElements(locator);
	}
	public WebElement waitandTakeelement(By by) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
		WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(by));
		return element;
	}
	public List<WebElement> waitandTakeelements(By by) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
		List<WebElement> element= wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
		return element;
	}
	public void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) BaseClass.driver; 
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void gopageend() {
		BaseClass.driver.findElement(By.tagName("body")).sendKeys(Keys.END);;
	}
	public void comepageup() {
		BaseClass.driver.findElement(By.tagName("body")).sendKeys(Keys.HOME);;
	}
	public String titlt() {
		return BaseClass.driver.getTitle();
	}
	public void waitAndClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();;
	}
	public void waitToLoad(By element) {
		WebDriverWait wait = new WebDriverWait(BaseClass.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(element));
	}
	public String gettext(By by) {
		return	BaseClass.driver.findElement(by).getText();	 
	}}