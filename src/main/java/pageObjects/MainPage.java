package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
  public WebDriver driver;
  
  
  By departurecity = By.id("ctl00_mainContent_ddl_originStation1_CTXT"); 
  By selectcity = By.xpath("//a[@value='BLR']");
  
  By arrivalcity = By.xpath("(//a[@value='MAA'])[2]");
  
  
  By submit = By.xpath("//input[@type='submit']");
  
   By text = By.cssSelector("span.text-label.text-active");

  
  public MainPage(WebDriver driver) {
	   
	  this.driver = driver;
  }
  
  public WebElement getDeparturecity() {
	  
	  return driver.findElement(departurecity);
	 
  }
  
public WebElement getSelectBLR() {
	  
	  return driver.findElement(selectcity);
  	
}
public WebElement getSelectMAA() {
	
	return driver.findElement(arrivalcity);
	
}
public WebElement getLogo() {
	
	return driver.findElement(text);
	
}
public WebElement getSubmit() {
	
	return driver.findElement(submit);
	
}


}
