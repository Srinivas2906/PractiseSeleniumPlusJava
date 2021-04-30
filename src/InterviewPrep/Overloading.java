package InterviewPrep;

public abstract class Overloading {
	
	Overloading()
	{
		
		System.out.println("constructor");
	}

	public void m1()
	{
		System.out.println("m1() method");
	}
	public void m1(int i)
	{
		System.out.println("m1() overloaded using int paramenter");
	}
	public String m2()
	{
		System.out.println("m1() overloaded with return type");
		return "m1() overloaded with return type";
	}
	public int m2(int a)
	{
		return 10;
	}
	public abstract void m3();
}
