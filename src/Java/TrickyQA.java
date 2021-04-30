package Java;

import org.apache.poi.ddf.EscherColorRef.SysIndexSource;

public class TrickyQA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 printNumbsWoint();
		 withoutUsingsemicolon();
		 numDivByZero();
		 integerCache();
		 Staticex ex= new Staticex();
		 //System.out.println(Staticex.age);

	}
//Print 1 to 100 with using numbers
	public static void printNumbsWoint(){
		int num = 'a'/'a';
		String s ="..........";
		for(int i=num;i<(s.length()*s.length());i++){
			System.out.println(i);
		}
	}
	
	//Print any message without using semincolon
	public static void withoutUsingsemicolon()
	{
		if(System.out.printf("hello world" + "\n")==null)
		{
			
		}
		if(System.out.append("hello world"+"\n")==null)
		{
			
		}
		if(System.out.append("hello world" +"\n").equals(null)){
			
		}
				
	}
	public static void numDivByZero()
	{
//		int i=9;
//		int j =0;
//		int k=i/j;
		System.out.println(9.0/0); //double and floating number divided by zero gives output as infinity
		
		System.out.println(10/0.0);
		System.out.println(0.0/0);
		//System.out.println(k);
		
	}
	public static void integerCache()
	{
		Integer num1 =100;
		Integer num2 =100;
		
		if(num1==num2)
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
	}
}
