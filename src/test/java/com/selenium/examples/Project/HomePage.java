package com.selenium.examples.Project;

import java.io.IOException;
//import java.util.List;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import junit.framework.Assert;
import pageObjects.MainPage;
import resourses.Base;

public class HomePage extends Base {
	
	public static Logger log = LogManager.getLogger(Base.class.getName());
	
 @Test
 public void basePageNavigation() throws IOException
 {
	 driver = initializeDriver();
	 
	 log.info("driver is initialized");

	 driver.get("http://www.spicejet.com");
	 driver.manage().window().maximize();
	 
	 log.info("navigated to homepage");
	 MainPage m = new MainPage(driver);
	 
	 m.getDeparturecity().click();
	 m.getSelectBLR().click();
	 m.getSelectMAA().click();
	
	 
While(!driver.findElement(By.cssSelector("div.ui-datepicker-header.ui-widget-header.ui-helper-clearfix.ui-corner-left")).getText().contains("August")) ;   
	 
	 {

		 driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click(); 
	 }
	 
	 
	 List<WebElement> dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']"));
		 
	   int count = dates.size();
	   for(int i=0; i<count;)
	   {
		   String text = dates.get(i).getText();
		   if(text.equalsIgnoreCase("25"));
		   {
			   dates.get(i).click();
			   break;
		   }
		}
	 
	 m.getSubmit().click();
	 log.info("Successfull");
	 
	
	 
 }

private void While(boolean b) {
	// TODO Auto-generated method stub
	
}

   
    
 
 
 

}
	
