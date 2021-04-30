package Java;

public class LeapYear {

	public static void main(String[] args) {
		
		// should be divisble by 4
		//should be divisible by 100
		//Centuries should be divisible by 400
		
		leap(1900);
		leap(2000);
		leap(2056);
		leap(2368);
		leap(1901);
		leap(2020);
		leap(1905);
	}
	public static void leap(int num)
	{
		boolean flag = false;
		
		if(num%4==0)
		{
			if(num%100==0)
			{
				if(num%400==0)
				{
					flag =true;
				}
				else{
					flag = false;
				}
			}
			else{
				flag = true;
			}
		}
		else{
			flag=false;
		}
		if(flag)
		{
			System.out.println(num+ " is a leap year");
		}
		else
		{
			System.out.println(num+" is not a leap year");
		}
	}

}
