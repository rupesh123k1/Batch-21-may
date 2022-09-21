package Pompackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn 
{
	
	@FindBy (xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement Password;
	
	@FindBy (xpath="//button[text()=' Login ']")
	private WebElement LogInButton;
    
//              int         a  
  public LogIn(WebDriver driver)
  {
	   PageFactory.initElements(driver, this);
	   
  }
  
  
public void SenUserName()
   {
	   username.sendKeys("Admin");
   }
   
   
   public void sendpassword()
   {
	   Password.sendKeys("admin123");
   }
   
   public void clickOnloginButton()
   {
	   LogInButton.click();
   }
   
   
}
