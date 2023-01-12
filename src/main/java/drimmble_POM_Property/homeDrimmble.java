package drimmble_POM_Property;


import java.awt.Image;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homeDrimmble 


{                         //Declaration
	@FindBy(xpath="(//img[@alt='Madhuri Patil'])[1]") private WebElement image;
	
   @FindBy(id="user-profile")private WebElement profile;
   
   @FindBy(xpath="//h1[text()='Madhuri Patil']")private WebElement text;
   
   @FindBy(id="user-profile")private WebElement signOut;
                         //Initialization
   
   public homeDrimmble(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void clickOnImage()
   {
	   image.click();
   }
   
   public void clickOnProfile()
   {
	   profile.click();
   }
   
   public String getUserName()
   {
	   String actualUserName = text.getText();
	  // Reporter.log("getting user name",true);
	return actualUserName;
   }
   
   public void clickOnSignOut()
   {
	   image.click();
	   signOut.click();
   }
   
   
}
