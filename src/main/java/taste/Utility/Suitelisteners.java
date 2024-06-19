package taste.Utility;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.IAnnotationTransformer;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

import taste.TestBase.BaseClass;

public class Suitelisteners implements ITestListener, IAnnotationTransformer {



	public void onTestFailure(ITestResult result) {
		File fl= ((TakesScreenshot)BaseClass.driver).getScreenshotAs (OutputType.FILE);
		try {
			FileUtils.copyFile(fl, new File(Constant.screenShotPath+Constant.screenShotPNGExtension));
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}         

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		annotation.setRetryAnalyzer(RetryAnalayser.class);
	}
}
