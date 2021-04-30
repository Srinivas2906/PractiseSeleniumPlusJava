package Java;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcdef";
		//int i=10;
		
		
		for(int i=s.length()-1; i>=0;i--)
		{
			char rev = s.charAt(i);
			
			System.out.println(rev);
			
			
		}
		
	}

}
