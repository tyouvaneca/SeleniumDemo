package resourses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Base {
	
	public WebDriver driver;

	public WebDriver initializeDriver() throws IOException
	{
		Properties p = new Properties();
   FileInputStream fis = new FileInputStream("C:\\Users\\tkish\\eclipse-workspace\\Project\\src\\main\\java\\resourses\\data.properties");
   
   p.load(fis);
 
  
  System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");	
   driver = new ChromeDriver();
  
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     return driver;
  
   
	}
	
	public void getScreenShotPath(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destination));
		
	}
}
