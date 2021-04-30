package InterviewPrep;

public class Overriding extends Overloading {
	
	private Overriding()
	{
		
		System.out.println("private constructor");
	}
	public static void getInstance()
	{
		Overriding ooo= new Overriding();
	
	}
	public void m1(){
		System.out.println("m1()  is overrden in Overiding class");
	}
	
	public String m2(String s)
	{
		System.out.println("overridden");
		return "overidden";
	}

	public String m2()
	{
		System.out.println("overideen with no arguments ");
		return "ov";
	}
	
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
public static void main(String args[])
{
	Overriding oa = new Overriding();
	oa.m1(10);
	oa.m2("sh");
	oa.m2();
}
}
