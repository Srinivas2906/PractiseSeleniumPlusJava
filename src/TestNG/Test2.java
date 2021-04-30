package TestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class Test2 {
	
//	@FindBy(id="xx")
//	private WebElement li;
//	


	@Test(priority=1)
	public void test1()
	{
		System.out.println("test1");
	}
	@Test(groups ={"smoke"})
	public void set1()
	{
		System.out.println("Alphabetic test");
	}
	@Test(groups ={"smoke"})
	public void test2()
	{
	//	SoftAssert assert = new SoftAssert();
		
		
		System.out.println("test2");
	}
	@Test(groups ={"smoke"})
	public void test3()
	{
		System.out.println("test3");
	}
	@Test
	public void test4()
	{
		System.out.println("test4");
	}
}
