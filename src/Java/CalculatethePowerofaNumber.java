package Java;

public class CalculatethePowerofaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=10;
		
		System.out.println(Math.pow(n, 2));
		long l= (long)Math.pow(4, 3);
		System.out.println(l);
		int num1 = Math.getExponent(n);
		System.out.println(num1);
		
		int base = 3;
		int expon = 3;
		
		int res = 1;
		
		while(expon!=0)
		{
			res = res*base;
			expon--;
		}
		System.out.println(res);
	}

}
