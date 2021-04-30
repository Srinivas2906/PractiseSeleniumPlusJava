package TestNG;

import java.util.concurrent.ThreadLocalRandom;

public class Test1 {

	public static void main(String[] args) throws InterruptedException
	{
		generateId();
	}
	public static long generateId() throws InterruptedException {
	
		while (true) 
		{
			ThreadLocalRandom random = ThreadLocalRandom.current();
			System.out.println(random.nextLong(80000000000L, 89999999999L));
			
			Thread.sleep(5000);
		}
		  
		
		
	}
}
