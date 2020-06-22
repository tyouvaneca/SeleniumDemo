package com.selenium.examples.Project;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.MainPage;
import resourses.Base;
	 
	 public class Validation extends Base {
			
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
			
		
			 Assert.assertEquals(m.getLogo().getText(), "Flight Status");
	 
	 
		 } 
	 
}
