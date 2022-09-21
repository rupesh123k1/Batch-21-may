package TestPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pompackage.LogIn;
import utility.OpenBrowser;

public class TestClass_TestNG extends OpenBrowser 

{
	
	WebDriver driver;
	@BeforeClass
	public void beforeClass()
	{
		WebDriver driver1 = chromeBrowser();
		this.driver=driver1;
	}
	
	@Test
	public void  testB()
	{ 
		
	
		LogIn LG = new LogIn(driver);
		
		LG.SenUserName();
		LG.sendpassword();
		LG.clickOnloginButton();
         System.out.println("test A for ClassA");
	}

	@Test
	public void testA()
	{
		System.out.println("testA");
		
 }
}
