package TestNG_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


//This method is used for Flipkart Login But After that Duo to TestNG.xml mile i have changed the URL To FaceBook For FrameWork Purpose
public class BasicMethod extends LounchBrowserTest{
	@Test
	@Parameters({"url","Email","password"})
	public void title(String url,String Email,String password) throws Throwable {	
		driver.get(url);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//a[@class=\"_1_3w1N\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\" ]")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		String titleHome=driver.getTitle();
		Thread.sleep(10);
		Assert.assertEquals(titleHome, "The entity name must immediately follow the '&' in the entity reference.");
		
	}
	@Test(dependsOnMethods="title")
	public void LogTest() { 
		
		
	}
	

}
