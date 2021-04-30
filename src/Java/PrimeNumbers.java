package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		isPrime(15);
		isPalinStr("hello");
		isPalinStr("abba");
		swap();
		isPalinInt(151);
		ams(153);
		dupArray();
	
		String prime ="";
		for(int i=0;i<=100;i++)
		{
			int counter =0;
			for(int j=i;j>=1;j--)
			{
				if(i%j ==0)
					counter++;
			}
		
			if(counter ==2)
			{
				prime =prime+ i +  " ";
					}
		}
System.out.println("prime numbers are "+ prime);
	}

	public static void isPrime(int n)
	{
		int temp=n;
		boolean flag =true;
		for(int i=2; i<=temp/2;i++)
		{
			if(temp%i==0){
				flag=false;
				break;
			}
		}
			if(flag)
			{
				System.out.println(temp+" is prime number");
			}
			else{
				System.out.println(temp+"is not a prime");
			}
		}
	
	public static void isPalinStr(String str){
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev =rev + str.charAt(i);
			
			
		}
		
		if(rev.equals(str))
		{
		System.out.println(rev+ " is palindrone");
		}
		else{
			System.out.println(rev+ " not a palindrone");
		}
		
	}
	
	//Interger palindrone
	public static void isPalinInt(int num)
	{
		int temp = num;
		int rev=0;
		int rem;
		while(temp!=0)
		{
			rem =temp%10;
			rev = rev*10+rem;
			temp =temp/10;
		}
		if(rev==num)
		{
			System.out.println(num+ " is palindrone");
		}
		else{
			System.out.println(num+ " is not palindrone");
		}
	}
	
	//Swap
	public static void swap()
	{
		int i=20;
		int j=30;
		int k=0;
		
		k=i+j;
		i=k-i;
		j=k-j;
		
		System.out.println("i is "+i + " and j is "+j);
	
		
		int l =50;
		int m=100;
		
		l=l+m;
		m=l-m;
		l =l-m;
		
		System.out.println("l is "+ l + " and m is " + m);
		
	}
	
	//Amstrng
	public static void ams(int num1)
	{
		int rem=0;
		int temp =num1;
		int rev=0;
		
		while(temp>0)
		{
			rem = temp%10;
			rev = rev+(rem*rem*rem);
			temp=temp/10;
			
			
			
		}
		System.out.println(rev);
		
		if(rev==num1)
		{
			System.out.println(num1+" is amstrong");
		}
		else{
			System.out.println(num1 + " is not amstrong");
		}
	}
	
	//Duplicates in an array
	public static void dupArray(){
		int a[] = {1,2,3,1,2,31,44,12,1,2,};
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{	 
				if(a[i]==a[j]){
					
					System.out.println("duplicate values are "+a[i]);
				}
				
			}
			
		}
		System.out.println(count);
		
		Set<String> s = new HashSet<String>();
		s.add("hello");
		s.add("hye");
		s.add("apple");
		s.add(null);
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("hello");
		a1.add("java");
		a1.add("point");
		Collections.sort(a1);
		
		Iterator<String> it = s.iterator();
		while(it.hasNext())
		{
				System.out.println(it.next());		}
		for(String sa:s)
		{
			System.out.println(sa);
				
		}
		
		
		
	}
	
	
}
