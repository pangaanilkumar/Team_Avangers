package TestNG_Basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics {
	@BeforeSuite
	public void lunchOpen() {
		System.out.println("Enter BEforSuite");
	}

@BeforeClass
public void lunchBrowser() {
	System.out.println("Enter BEforClass");
}
@BeforeTest
public void lunc() {
	System.out.println("Enter BEfortests");
}

@BeforeMethod
public void lunchB() {
	System.out.println("Enter BEforMethod");
}
@Test
public void lunchBr() {
	System.out.println("Enter test");
}
@Test
public void lunchBr1() {
	System.out.println("Enter test1");
}
@Test
public void lunchBr0() {
	System.out.println("Enter test3");
}

@AfterMethod
public void lunchBrowse() {
	System.out.println("Enter AfterMethod");
}

@AfterTest
public void lun() {
	System.out.println("Enter Aftertest");
}

@AfterClass
public void lunchBrows() {
	System.out.println("Enter AfterClass");
}

@AfterSuite
public void lunchBro() {
	System.out.println("Enter BEforClass");
}






}
