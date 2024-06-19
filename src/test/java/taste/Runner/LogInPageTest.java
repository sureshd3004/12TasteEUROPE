package taste.Runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import taste.PageActions.HomepageActions;
import taste.PageActions.LoginPageActions;
import taste.TestBase.BaseClass;
import taste.Utility.Fetchelement;


public class LogInPageTest extends BaseClass{
	
	WebDriver driver;
	LoginPageActions loginpage = new LoginPageActions();
	@Test()
	public void LogInpageTest1() {
		loginpage.verifyLoginPageIsLoaded();

	}
	@Test()
	public void LogInpageTest2() {
		
		loginpage.enterCredentialswrong();
	}
	@Test()
	public void LogInpageTest3() {
		
		loginpage.enterCredentialswrong1();
	}
	@Test()
	public void LogInpageTest4() {
		
		loginpage.Registerwithexistingemail();
	}
	@Test()
	public void LogInpageTest5() {
		
		loginpage.forgotPassword();
	}
	@Test()
	public void LogInpageTest6() {
		
		loginpage.Registerwithnewemail();
	}
	@Test()
	public void LogInpageTest7() {
		
		loginpage.enterCredentialscorrect();
	}
}