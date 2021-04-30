package Java;

public class AmstringNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		amstrongNum(153);
		amstrongNum(154);
		amstrongNum(370);
		amstrongNum(371);
		amstrongNum(405);
		amstrongNum(9474);

	}
	
	public static void amstrongNum(int num){
		
		int temp =num;
	
		int rem=0;
		int res=0;
		int times =0;
//		
//		while(num>0)
//		{
//			num = num/10;
//			times++;
//		}
		//int temp1=num;
		while(num>0)
		{
			rem = num%10;
			res = res+(rem*rem*rem);
			//res = (int) ((int)res+(Math.pow(rem, times)));
			num = num/10;
			
		}
		if(res==temp)
		{
			System.out.println(temp+" is amstrong");
		}
		else
		{
			System.out.println(temp+" is not an amstrong");
		}
	}

}
