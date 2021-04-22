package TestNG_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
	
public class TDD_FrameWork extends LounchBrowserTest{
	JavascriptException jse=(JavascriptException)driver;
	@Test
	public void Facebook_CraeteAccount_FunctionalTesting(String FirstName,String SureName,
			String Email,String Pass,String Date,int Month,int year,String Gender) {
		driver.findElement(By.xpath("//a[@id=\"u_0_2_9d\"]")).click();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys(FirstName);
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys(SureName);
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys(Email);
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys(Pass);
		
		List<WebElement> Days=driver.findElements(By.xpath("//select[@title=\"Day\"]"));
		for(WebElement e:Days) {
			String s=e.getText();
			if(s.equals(Date)) {
				e.sendKeys(Date);
			}
		}
		List<WebElement> Months=driver.findElements(By.xpath("//select[@title=\"Day\"]"));
		for(WebElement e:Days) {
			String s=e.getText();
			if(s.equals(Date)) {
				e.sendKeys(Date);
			}
		}
	}
	
}
