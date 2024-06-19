package taste.Utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalayser implements IRetryAnalyzer{
int count= 0;
int retrycount=0;
	public boolean retry(ITestResult result) {
		while(count<retrycount) {
			
			
			count++;
			return true;
		}
		return false;
	}

}
