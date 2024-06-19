package taste.PageActions;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.hc.client5.http.cookie.Cookie;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import taste.TestBase.BaseClass;
import taste.Utility.Fetchelement;

public class LoginPageActions {

	Fetchelement ele = new Fetchelement();

	By blogs = By.xpath("//*[@id=\"page-content\"]/div[4]/div/div/div[2]/div/a[1]");
	By userid= By.xpath("//input[@id='username']");
	By passkey= By.xpath("//input[@id='password']");
	By loginbtns= By.xpath("//button[@name='login']");
	By regboxs= By.xpath("//input[@id='reg_email']");
	By regbtns= By.xpath("//button[@name='register']");
	By rememberMe= By.xpath("//span[normalize-space()='Remember me']");
	By errmsg= By.xpath("//div[@id='page-content']/li[1]/strong");
	By wronguseriderror = By.xpath("//*[@id='page-content']/div[2]/div/div/div[1]/ul/li/strong[1]");
	By accname = By.xpath("//h3[@class='mb-1']");
	By forgotpass = By.xpath("//a[text()='Lost your password?']");


	WebElement useridbox = ele.waitandTakeelement(userid);
	WebElement passbox = ele.waitandTakeelement(passkey);
	WebElement loginbtn = ele.waitandTakeelement(loginbtns);
	WebElement regbox = ele.waitandTakeelement(regboxs);
	WebElement regbtn = ele.waitandTakeelement(regbtns);

	public void verifyLoginPageIsLoaded(){
		BaseClass.driver.get("https://dev.12taste.com/my-account/");		
		Assert.assertEquals(ele.titlt(), "My account | 1-2-Taste");
	}
	public void enterCredentialswrong(){
		useridbox.sendKeys("suresh.d30@hi.com");
		passbox.sendKeys("suresh2508");
		loginbtn.click();		
		Assert.assertEquals("Error", ele.gettext(wronguseriderror));
	}
	public void enterCredentialswrong1() {
		useridbox.clear();
		useridbox.sendKeys("suresh.d30@outlook.com");
		passbox.clear();
		passbox.sendKeys("5465");
		loginbtn.click();		
		//	String text  = ele.getWebElement("XPATH", "//*[@id='page-content']/div[2]/div/div/div[1]/ul/li/strong[1]").getText();
		Assert.assertEquals("Error", ele.gettext(wronguseriderror));
	}
	public void enterCredentialscorrect() {
		useridbox.clear();
		useridbox.sendKeys("suresh.d30@outlook.com");
		passbox.clear();
		passbox.sendKeys("suresh2508");
		loginbtn.click();		
		Assert.assertEquals("suresh d", ele.gettext(accname));	
	}
	public void Registerwithexistingemail()  {
		regbox.sendKeys("suresh.d@12taste.com");
		regbtn.click();
		Assert.assertEquals("Error",ele.gettext(accname));
	}
	public void Registerwithnewemail() {
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		useridbox.sendKeys(timestamp);
		regbtn.sendKeys(Keys.ENTER);	
		BaseClass.driver.manage().deleteAllCookies();
		BaseClass.driver.get("https://dev.12taste.com/my-account/");
	}
	public void forgotPassword() {
		Assert.assertEquals(true, ele.takeElement(forgotpass).isEnabled());
	}
}
