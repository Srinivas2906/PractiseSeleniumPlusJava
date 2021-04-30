package TestNG;

import org.testng.annotations.Test;

public class Test5 {
	
	@Test(priority =1, groups="smoke")
	public void testPr1(){
		System.out.println("priority test 1");
	}

	@Test(priority =-1)
	public void testPr2(){
		System.out.println("priority test 2");
	}

	@Test(priority =300)
	public void testPr3(){
		System.out.println("priority test 3");
	}
	
	
	
	@Test(dependsOnMethods={"testPr5","testPr6"})
	public void testPr4(){
		System.out.println("priority test 4");
	}
	@Test
	public void testPr5(){
		System.out.println("priority test 5");
	}
	@Test
	public void testPr6(){
		System.out.println("priority test 6");
	}

}
