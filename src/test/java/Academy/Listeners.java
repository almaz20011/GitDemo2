package Academy;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.base;

public class Listeners implements ITestListener{
	
	//creating an object from 'base' to get 'screenshot method' into this class
	base b = new base();
	

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//result.getName());//***  w/o this applying method to store all pictures, all 'failed pictures w/the same name, will be replaced each by each

		try {
			b.getScreenshot(result.getName());//***  w/o this applying method to store all pictures, all 'failed pictures w/the same name, will be replaced each by each

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	

}
