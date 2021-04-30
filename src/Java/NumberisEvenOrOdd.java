package Java;

public class NumberisEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		evnOrOdd(30);
		evnOrOdd(31);
	}

	public static void evnOrOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is Odd");
		}
	}
}
