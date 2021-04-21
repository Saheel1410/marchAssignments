package testAnalyzer01;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnlyzr implements IRetryAnalyzer{
	int maxCount = 3;
	int retryCount = 0;

	public boolean retry(ITestResult result) {
		if (!result.isSuccess() && retryCount<maxCount ) {
			retryCount++;
			 return true;
			
		}
		return false;
	}
	

}
