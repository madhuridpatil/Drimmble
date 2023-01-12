package drimmble_POM_Property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import drimmble_Utility_Property.UtilityProperty;

public class SignInDrimmble

{
                  // Declration
	@FindBy(id="login") private WebElement mailId;
		
	@FindBy(id="password") private WebElement password;
	
	@FindBy(xpath="//input[@class='button form-sub']")  private WebElement signIn;
	
	               // Initialization
		public  SignInDrimmble(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
			            //Usages
	
	public void EnterMailId(WebDriver driver,String mail)
	{
		UtilityProperty.WaitTest(driver,1000);
		mailId.sendKeys(mail);
		//Reporter.log("clicking on mailId Button", true); 
	}
	
	public void EnterPassword(WebDriver driver,String pass)
	{
		UtilityProperty.WaitTest(driver,1000);
		password.sendKeys(pass);
		//Reporter.log("clicking on password button", true); 
	}
	
	
	public void clickSignInButton(WebDriver driver)
	{
		UtilityProperty.WaitTest(driver,1000);
		signIn.click();
		//Reporter.log("clicking on sign in Button", true); 
	}
	
	
}
