package com.selenium.examples.Project;

import org.openqa.selenium.WebDriver;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

import resourses.Base;

public class Listeners extends Base implements IListeners{

	public void onTestStart(ITestResult result)
	{
		
	}
	public void onTestSuccess(ITestResult result)
	{
		
	}
	
	public void onTestFailure(ITestResult result)
	{
		WebDriver driver = null;
		String testMethodName = result.getMethod().getMethodName();
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		catch(Exception e)
		{
			
		}
		try
		{
		getScreenShotPath(testMethodName,driver);
	   }
		catch(Exception e)
		{
			
		}
	}	
	public void getScreenShotPath(String testMethodName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	public void onTestSkipped(ITestResult result)
	{
		
	}
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}
	
	
	public void onStart(ITestResult result)
	{
		
	}
	public void onFinish(ITestResult result)
	{
		
	}
	@Override
	public Class<? extends ITestNGListener>[] getValue() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setValue(Class<? extends ITestNGListener>[] value) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
}
