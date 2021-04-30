package SeleniumPlusJava;

public class MultiLevelRverseNumber {

	public static void main(String[] args) {
		
		A a = new A();
		a.rev(1223);
		System.out.println(A.staticVar);
		B b = new B();
		b.ams(151
				);
		C c = new C();
		c.ams(351);
			c.swap();
			
			String[] sr = { "si", "is", "is", "li", "si" };
			for(int i=0; i<sr.length ;i++)
			{
				for(int j=i+1; j<sr.length;j++)
				{
					if(sr[i].equalsIgnoreCase(sr[j]))
					{
						System.out.println(sr[j]);
					}
				}
			}
	}

}
class A{
	static int staticVar=10;
	public void rev(int num)
	{
		int rem=0, k=0;
		int reverse=0;
		
		while(num!=0)
		{
			rem = num%10;
			reverse = (reverse*10) +rem;
			num = num/10;
		}
		System.out.println(reverse);
	
	}
	
}
class B extends A{
	public void ams(int num1)
	{
	int c=0;
	int r=0;
	int  temp=num1;
	
		while(num1!=0)
		{
			r = num1%10;
			c= c+ (r*r*r);
			num1 = num1/10;	
			
		}
		if(c==temp)
		{
			System.out.println("Amstrong num");
		}
		else{
			System.out.println("Not an Amstrong");
		}
	}
}
class C extends B
{
	int i=20;
	int j=30;
	
	public void swap()
	{
		i=i+j;
		j= i-j;
		i=i-j;
System.out.println("i= "+i +"J ="+j);
	}	
}

