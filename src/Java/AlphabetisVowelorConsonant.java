package Java;

public class AlphabetisVowelorConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] ch = {'a','e','i','o','u'};
		vowelorConst('d');
		vowelorConst('e');
		
	}
	
	public static void vowelorConst(char c)
	{
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("Given character is vowel");
		}
		else
			System.out.println("Given character is constant");
	}

}
