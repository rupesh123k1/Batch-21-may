package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pompackage.LogIn;

public class TestCaseOragane 
{
   public static void main(String[] args) {
	


	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe"); 
	
	WebDriver driver  =new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	
	LogIn LoginPage = new LogIn(driver);
	
	
	LoginPage.SenUserName();
	LoginPage.sendpassword();
	LoginPage.clickOnloginButton();
	
}
}