package InterviewPrep;

public class Staticblock  {

	static int a =20;
	static {
		int a20 = 20;
		System.out.println("static block");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
	
		System.out.println("main method");
	}

	static {
		int b20 = 20;
		System.out.println("static1 block");
	}
	
}
