package TestNG;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test
	public void aest1()
	{
		System.out.println("starts with a");
	}
	
	@Test
	public void t()
	{
		System.out.println("starts with t");		
	}

	@Test(priority =-300)
	public void best2()
	{
System.out.println("negative priority");
	}
	@Test(priority =1)
	public void abst2()
	{
		System.out.println("positive priority");		
	}
}
