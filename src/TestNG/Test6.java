package TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test6 {
	
	
	@Test
	public void saTest1(){
		System.out.println("saTest1");
	}
	
	
	@Parameters("URL")
	@Test
	public void parameterTest(String urlname)
	{
		System.out.println("parameterTest");
		System.out.println(urlname);
	}

}
