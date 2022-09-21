package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends OpenBrowser
{
	
public static void ExWait(WebDriver driver)
{
	WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	  
	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
}
}
