package Java;

import java.util.Arrays;

public class AllStrings {

	public static void main(String[] args) {
	
		String s1 = "hello";
		String s2 =  "hedld";
		String s3 = "Hello";
		//String s3 ="hello";
		
		
		
		String s5 = new String();
		String s6 =new String("java");
		String s7 =new String("Strings");
		String s8 = new String("java");
		String s9 =null;
		
		String s10= "java";
		String s11 ="java";
	
		System.out.println("s6 is" + s6);
		
		//Compare to
		System.out.println("compare s1 and s2: "+s1.compareTo(s2));
		System.out.println("compare s2 and s1: "+s2.compareTo(s1));
		System.out.println("compare s1 and s3: "+s1.compareTo(s3)); //CompareTo is also case sensitive, all the characters should be equal to return a value 0.
		System.out.println("compare s1 and s3 with equalIgnorecase method: "+s1.compareToIgnoreCase(s3));
		
		//Concat
		System.out.println("s1 concat s1: "+ s1.concat(s2));
		System.out.println("s1+ s2 is: " + s1+s2);
		System.out.println("hello + world is :" + "hello"+"world");
		//System.out.println("s1 concat with null: " + s1.concat(s9));  --Null pointer excetion (concat only concats other string
		System.out.println("s1 + null is: "+ "s1"+null);
		
		//equals
		System.out.println("s1 content equals s3: "+s1.contentEquals(s3)); //false
		System.out.println("s1 equals s3: "+s1.equals(s3)); //false
		System.out.println("s1 equals s6 : "+s1.equals(s6)); //false
		System.out.println("s6 equals s10 : "+s6.equals(s10)); //true
		System.out.println("s6 equals s8 : "+s6.equals(s8)); //true
		System.out.println("s10 equals s11 : "+s10.equals(s11)); 
		System.out.println("s6 == s10: "+ s6==s10);
		System.out.println("s6 == s8: "+ s6==s8);
		System.out.println("s10 == s11: "+ s10==s11);
		System.out.println("s1 contains s: "+ s1.contains("s"));
		
		//index of
		System.out.println("s1 index of ll  is: "+ s1.indexOf("llo"));
		
		System.out.println(s1.indexOf("ll", 1));

		System.out.println("*****************Split**********************");
		//split
		String s14 ="hello::world::Java";
		String[] res= s14.split("::",2);
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(s14.split("o")));
		
		
		
		
		
		String s15="a+b+c";
		System.out.println(Arrays.toString(s15.split("\\+")));
		
		System.out.println("*****************Substring**********************");
		//Substring
		System.out.println(s1.substring(1));
		//Object a1 = s4.charAt(2);
		//System.out.println(a1);
		
		//replace
		System.out.println("*****************Replace**********************");
		String s16 ="java pro pro pro";
		String s17 ="java lava kava";
		String s18 ="ja+va++pro+6";
		
		System.out.println(s16.replace('r', 'a'));  //
		System.out.println(s16.replaceAll("r", "ok")); //accepts only string 
		System.out.println(s18.replace("\\+", "%"));  ///replace can be used with just "+"
		System.out.println(s18.replaceAll("\\+", "%"));
		
		
		splitAndRev("helllo world");
		onlyRev("hello world");
		
		//trim
		String s4 ="          %&^%    *&def0123";
		System.out.println("trim s4: " +s4.trim());
		String s4res= s4.replaceAll("\\s", "");
		System.out.println(s4res);
		System.out.println("replace all the unwanted characters: "+s4.replaceAll("[^0-9A-Za-z]",""));
		
	}

	public static void splitAndRev(String str)
	{
		String[] givenString = str.split(" ");
		String revStr = "";
		
		for(int i=0;i<givenString.length;i++)
		{
			String word = givenString[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revword = revword+word.charAt(j);
				
			}
			revStr = revStr+revword+"";
		}
		System.out.print(revStr+" ");
		
		System.out.println();
	}
	
	public static void onlyRev(String str2)
	{
		for(int i=str2.length()-1;i>=0;i--)
		{
			
			System.out.print(str2.charAt(i));
			
		}
		System.out.println();
		StringBuffer sb = new StringBuffer(str2);
		System.out.println("using String bffer" + ":"+ sb.reverse());
	}
}
