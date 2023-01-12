package drimmble_Utility_Property;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;


public class UtilityProperty
{
	
	public static String readDataFromPropertyFile(String key) throws IOException
	{
		// create object of property class	 
		
		Properties prop = new Properties();
		
		//create object of FileInputStream 
		FileInputStream myFile = new FileInputStream("C:\\Users\\madhu\\eclipse-workspace\\Practice_Coding\\Drimmble_properties");
		
		prop.load(myFile);
		String value = prop.getProperty(key);
		
		//Reporter.log("reading value of"+key+"from property file",true);
		return value;
	}
	
		public static void scrollIntoView(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		//Reporter.log("scrolling into view "+element.getText(),true); 
	}

      public static void takesScreenshot(WebDriver driver,String FileName) throws IOException, InterruptedException
    {
    	Thread.sleep(1000);
        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	    File Destiction =new File("D:\\"+FileName+".png");
	    //.png ghetl nahi tr ss yet nahi code yeto-->check it by remove dot
	    FileHandler.copy(source, Destiction);
	    //Reporter.log("taking screenshot ",true); 
    }

     public static void WaitTest(WebDriver driver,int waitTime)
    {
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
      //Reporter.log("waiting for "+waitTime+"milis",true); 
    }

    }
