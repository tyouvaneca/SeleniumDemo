package resourses;

//import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports {
   
	ExtentReports extent;
	 
	public void getReportObject()
	{
		String path =System.getProperty("user.dir")+"\\reports\\index.html";

		ExtentSparkReporter reporter = new ExtentSparkReporter(path);

		reporter.config().setReportName("Web Automation Results");

		reporter.config().setDocumentTitle("Test Results");

		extent =new ExtentReports();
		
	

		extent.attachReporter(reporter);

		extent.setSystemInfo("Tester", "Youvaneca");
	}

	private void attachReporter(ExtentSparkReporter reporter) {
		// TODO Auto-generated method stub
		
	}

	private void setSystemInfo(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	
}