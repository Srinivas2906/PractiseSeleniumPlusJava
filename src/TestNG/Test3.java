package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {

	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("beforeSuite");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("beforeMethod");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("beforeTest");
	}
	@Test
	public void test()
	{
		System.out.println("test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("AfterTest");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("AfterClass");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("AfterSuite");
	}
	
	
}
