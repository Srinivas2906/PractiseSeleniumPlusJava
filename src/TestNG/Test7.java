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

public class Test7 {
	
	@BeforeSuite
	public void sampleTest1(){
		System.out.println("BeforeSuite");
	}
	@BeforeClass
	public void sampleTest2(){
		System.out.println("BeforeCLass");
	}
	@BeforeTest
	public void sampleTest3(){
		System.out.println("BeforeTest");
	}
	@BeforeMethod
	public void sampleTest4(){
		System.out.println("BeforeMethod");
	}
	@Test
	public void sampleTest5(){
		System.out.println("test");
	}
	@AfterSuite
	public void sampleTest6(){
		System.out.println("AfterSute");
	}
	@AfterClass
	public void sampleTest7(){
		System.out.println("AfterClass");
	}
	@AfterTest
	public void sampleTest8(){
		System.out.println("AfterTest");
	}
	@AfterMethod
	public void sampleTest9(){
		System.out.println("AfterMethod");
	}
}