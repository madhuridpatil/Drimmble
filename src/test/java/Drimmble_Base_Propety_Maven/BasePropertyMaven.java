package Drimmble_Base_Propety_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Reporter;
import org.testng.Reporter;


import drimmble_Utility_Property.UtilityProperty;

public class BasePropertyMaven
{
	//commit
    //madhuri patil	
	
	      protected WebDriver driver;
          // protected WebDriver driver;
	          public void launchBrowser()
	{
	     System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver.exe");
         driver=new ChromeDriver();	
	    
     	 driver.get("https://dribbble.com/session/new");  	 	 
     	 driver.manage().window().maximize(); 
	 	 	  Reporter.log("Launching browser",true); 
	 	  	  UtilityProperty.WaitTest(driver, 1000);
	}
	
public static void closingBrowser(WebDriver driver) throws InterruptedException
   {
		//Reporter.log("closing browser",true); 
 	 	Thread.sleep(500);  	 
 	 	driver.close(); 
   }
	
}
