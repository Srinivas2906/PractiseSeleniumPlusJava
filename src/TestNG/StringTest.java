package TestNG;

import org.testng.annotations.Test;

public class StringTest {
	
	@Test
	public void stringCompare()
	{

		String s = "abc";
		String s2 ="abc";
		String s3 = new String("def");
		String s4 =new String("def");
		String s5 ="a";
		
		if(s==s2)
			System.out.println("s==s2 is true");
		else
			System.out.println("s==s2 is false");

		if(s3==s4)
			System.out.println("s3==s4 is true");
		else
			System.out.println("s3==s4 is false");

		if(s.equalsIgnoreCase(s2))
			System.out.println("s1 equals s2 is true");
		else
			System.out.println("s eqauls s2 is false");
		if(s3.equalsIgnoreCase(s4))
			System.out.println("s3 eqauls s4 is true");
		else
		System.out.println("s3 eqauls s4 is false");
		
		System.out.println("s5 value is: "+ s5);
		
		boolean b = s.equals(s2);
		boolean b1 = s3.equals(s4);
		
		System.out.println("b is: "+b);
		System.out.println("b1 is: "+b1);
		int bb= s.compareTo(s3);
		int bb2 = s.compareToIgnoreCase(s2);
		int b3= s3.compareTo(s4);
		
		System.out.println("bb is: "+ bb);
		System.out.println("bb2 is: "+bb2);
		System.out.println("b3 is :"+b3);
		
		String s6= " abc ";
		System.out.println(s6);
		System.out.println(s6.trim());
		
	System.out.println(s6.replaceAll(" ", ""));
	String s7 =" defde";
	System.out.println(s7.replace('c', 'k'));
	System.out.println(s7.replaceAll("d", "f"));

	String s8="  q324qr@#$#%   jhdzcln  ";
	System.out.println(s8.replaceAll("[^A-Za-z0-9]",""));
	s8 = s8.replaceAll("[^A-Za-z0-9]","");
	System.out.println(s8.length());
		
	}

}
