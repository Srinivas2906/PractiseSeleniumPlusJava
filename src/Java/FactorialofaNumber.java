package Java;

public class FactorialofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int fact;
		factorial(4);
		factorial(10);
	}
	
	public static void factorial(int num)
	{
		int fact=1;
		for(int i=num;i>0;i--)
		{
			
			fact = fact*i;
			
		}
		System.out.println(fact);
		
		
	}

}
