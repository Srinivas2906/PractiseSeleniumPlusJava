package Java;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1234;
		int rev=0;
		//int temp=num;
		
		
		while(num>0)
		{
			int n =num%10;
			rev=(rev*10)+n;
		num=num/10;
			
		}
		System.out.println(rev);
		
		palindrone(321);
		palindrone(323);
	}
	
	public static void palindrone(int num1)

	{
		int rev1=0;
		int temp=num1;
		while(num1>0)
		{
			int x = num1%10;
			rev1 = (rev1*10)+x;
			num1 = num1/10;
		}
		
		if(temp==rev1)
		{
			System.out.println(rev1+ " is palindrone");
		}
		else
			System.out.println(rev1+ " is  not palindrone");
	}
}
