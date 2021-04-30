package Java;

public class CountNumbersInAnInteger {

	public static void main(String[] args) {
		
		
		int i=12355555;
		int count=0;
		
		
		while(i>0)
		{
		i=i/10;
		count++;
	
		}
		System.out.println(count);
	}

}
