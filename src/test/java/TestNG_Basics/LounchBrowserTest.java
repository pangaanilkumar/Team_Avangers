package TestNG_Basics;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LounchBrowserTest {
	WebDriver driver;
@BeforeMethod
@Parameters({"browser"})
public void LounchBrowser(String browser) {
	 {
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",".\\Driver\\geckodriver.exe");
			driver=new FirefoxDriver();
			}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
}
@AfterMethod
public void tearDown() {
	driver.close();

}
}
