package Java;

public class GenerateMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multiplication(3);
	}

	public static void multiplication(int num)
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(num+" x "+i+" = "+ (num*i));
		}
	}
}
