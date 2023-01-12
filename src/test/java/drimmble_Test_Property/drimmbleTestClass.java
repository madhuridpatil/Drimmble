package drimmble_Test_Property;

import org.testng.annotations.Test;

import Drimmble_Base_Propety_Maven.BasePropertyMaven;
import drimmble_POM_Property.SignInDrimmble;
import drimmble_POM_Property.homeDrimmble;

import drimmble_Utility_Property.UtilityProperty;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class drimmbleTestClass extends BasePropertyMaven
       {    
	        //declaration
            SignInDrimmble sign;
	        homeDrimmble home;
	
	@BeforeClass
	  public void LaunchBrowser()
	  {
		// initialization
		launchBrowser();
		sign=new SignInDrimmble(driver);
	    home=new homeDrimmble(driver);
	  }

	@BeforeMethod
	  public void LoginDrimmble() throws EncryptedDocumentException, IOException 
	  {
		
		sign.EnterMailId(driver, UtilityProperty.readDataFromPropertyFile("mailId"));
		sign.EnterPassword(driver,UtilityProperty.readDataFromPropertyFile("password"));
	
		sign.clickSignInButton(driver);
		
		home.clickOnImage();
		home.clickOnProfile();
	    // home.clickOnSignOut();
	  }
	
	@Test
	  public void validateUserName() throws EncryptedDocumentException, IOException, InterruptedException 
	  {
		Assert.assertEquals(home.getUserName(),UtilityProperty.readDataFromPropertyFile("userName"),"TC failed,actual and expected user name are not matching");
		UtilityProperty.takesScreenshot(driver,home.getUserName());
	  }
  
	@AfterMethod
	  public void SignOutButton() 
	  {
		home.clickOnSignOut();
	  }

	 @AfterClass
	  public void closeBrowser() throws InterruptedException 
	  {
		 closingBrowser(driver);
	  }

      }
