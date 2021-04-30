package Java;


class A{
	  static int a;
		final int b=100;
		protected int c=60;
		private int d;
		A(int d)
		{
			this.d =d;
			System.out.println(d);
		}
		
		static{
			 a=50;
			//int c=50;
			System.out.println(a);
			System.out.println("static block");
		}

		
	 
}

abstract class B extends A{
	B(int d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
int d=0;

	static{
		String s="helo";
		System.out.println(s);
	}
	
}
public class  ClassA extends B {
	
	
	ClassA(int d) {
		super(d);
		
		
	}
	static{
		int a=50;
		//int c=50;
		System.out.println(a);
		System.out.println("static block");
	}
	public static void main(String args[])
	{
		A a = new A(900);
		System.out.println(a.c);
			}
	
	
}
 