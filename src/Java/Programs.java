package Java;

public class Programs {
	public static void main(String[] args)
	{
		Amstrong(153);
		Amstrong(370);
		Amstrong(372);
		primeNum(7);
		primeNum(15);
		primeNums(100);
	}
	
	//Amstorng number (153 = 1*1*1 + 5*5*5 + 3*3*3)
	public static void Amstrong(int num)
	{
		int temp=num;
		int r=0;
		int c=0;
		
		while(num>0)
		{
			r = num%10;
			c=c+(r*r*r);
			num = num/10;
		}
		System.out.println(c);
		if(temp==c)
		{
			System.out.println("yes an Amstrong number");
		}
		else{
			System.out.println("not an amstrong number");
		}
	}
	
	public static void primeNum(int num1){
		int temp = num1;
		int i=2;
		boolean flag=true;
		
		while(i<=temp/2)
		{
			if(temp%i==0)
			{
				flag = false;
				break;
			}
			i++;
		}
		if(flag)
		{
			System.out.println(temp+ " is a prime number");
		}
		else{
			System.out.println(temp+ " is not a prime number");
		}
	}

	public static void printPrime(int num)
	{
		int temp = num;
		//int i =2;
		for(int i=2;i<temp;i++)
		{
			while(i<temp/2)
			{

				if(temp%i==0)
				{
					System.out.print(i+" ");
				}	
			}
		}
		
	}
	
	public static void primeNums(int n)
	{
		String primeNum ="";
		for(int i=1;i<=n;i++)
		{
			int counter =0;
			for(int num =i;num>=1;num--)
			{
				if(i%num==0){
				counter =counter+1;
				}
			}
			if(counter==2)
			{
				primeNum= primeNum+i+" ";
			}
		}
		System.out.println(primeNum);
	}
	
	
}
