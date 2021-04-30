package Java;

public class FindAPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPrime(18);
		printPrime();
	}

	public static void isPrime(int num)
	{
		boolean flag = true;
		for(int i=2; i<num/2;i++)
		{
			if(num%i==0)
			{
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println(num+" is prime ");
		}
		else
		{
			System.out.println(num+" is not prime");
		}
	}
	
	public static void printPrime()
	{
		for(int i=0;i<100;i++)
		{
			int counter =0;
			for(int j=i; j>=1;j--)
			{
				if(i%j==0)
					counter++;
			}
			if(counter ==2)
			{
				System.out.println(i);
			}
		}
	}
}
