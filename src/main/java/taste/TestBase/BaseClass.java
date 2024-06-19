package taste.TestBase;

import java.io.File;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import taste.Utility.Constant;

public class BaseClass {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest logger;


	@BeforeTest
	public void zeforeTestMethod(){
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + File.separator+"reports"+File.separator+"Report.html");
		extent = new ExtentReports();
		extent.attachReporter (sparkReporter);
		sparkReporter.config().setTheme (Theme.DARK);
		extent.setSystemInfo("HostName", "1-2-taste");
		extent.setSystemInfo("UserName", "Suresh");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setReportName("Automation Tests Results by Suresh");
	}
	@BeforeMethod
	public void be4method( Method testMethod) {
		logger = extent.createTest(testMethod.getName());
	}
	@BeforeTest
	@Parameters("browser")
	public WebDriver Basess(String browser) {
		if(browser.equalsIgnoreCase("chrome"))
		{	 
			//	ChromeOptions chromeOptions = new ChromeOptions();
			Map<String, String> mobileEmulation = new HashMap<>();
			mobileEmulation.put("deviceName", "Pixel 2");

			// Create ChromeOptions and set the mobile emulation settings
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
			driver=new ChromeDriver();       
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
		}
		else
		{
			throw new IllegalArgumentException("Please Check the Browser Configuration");
		}
		driver.get(Constant.EUpageURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constant.mediumWait));
		wait = new WebDriverWait(driver, Duration.ofSeconds(18));
		//	SearchResultPageAction search = new SearchResultPageAction(driver);
		return null;
	}
	@AfterMethod
	public void afterMethod (ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE){
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case Failed", ExtentColor.RED));
			logger.log(Status.FAIL, MarkupHelper.createLabel (result.getThrowable() +" Test Case Failed", ExtentColor.RED)); }
		else if(result.getStatus() == ITestResult.SKIP){
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case Skipped", ExtentColor.ORANGE));}
		else if(result.getStatus()== ITestResult.SUCCESS) {
			logger.log(Status. PASS, MarkupHelper.createLabel(result.getName() + "Test Case PASS", ExtentColor.GREEN)); }
	}
	@AfterSuite
	public void last() {
		driver.quit();
	}
	@AfterTest
	public void aftertest() {
		extent.flush();

	}

}
