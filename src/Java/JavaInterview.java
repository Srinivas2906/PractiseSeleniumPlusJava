package Java;

import java.util.Scanner;

import org.testng.annotations.Test;

public class JavaInterview {
	
	//Java program to print an integer entered by user
	@Test
	public void one()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of a");
		int a = sc.nextInt();
		System.out.println("value of a is: " +a);
	}
	
	//add, multipley int and flaot number
	@Test
	public void two()
	{
		int a = 10;
		int b=20;
		System.out.println("addition of a and b is: "+(a+b));
		
		float c = 10.9f;
		float d =20.9f;
		
		System.out.println("product of c and d is: "+ (c*d));
		
	}

	//Program to find ascii value of a character
	@Test
	public void ascii()
	{
		char ch ='a';
		int c =ch;
		
		int ascci =(int)ch;
		
		System.out.println(c);
		System.out.println(ascci);
		
	}
	
	//program to find quotient And Reminder
	@Test
	public void quotientAndReminder(){
		
		int dividend = 80;
		int divider = 40;
		
		int quotient = dividend/divider;
		int remainder = dividend%divider;
		
		System.out.println("quotient is :" +quotient);
		System.out.println("remainder is : "+ remainder);
	}
	
	//Program to swap
	@Test
	public void swap()
	{
		int a=20;
		int b=30;
		
		 a=a+b;
		b=a-b;
		a= a-b;
		
		System.out.println("value of a after swapping is: " +a);
		System.out.println("value of b after swapping is: "+ b);
	}
	
	
}
