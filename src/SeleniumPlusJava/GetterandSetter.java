package SeleniumPlusJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GetterandSetter {

	
	public static void main(String[] args) {
		
		GetterSetter nos = new GetterSetter();
		nos.setName("java");
		System.out.println(nos.getName());
		

		Map<Integer,String> emp = new HashMap<Integer,String>();
		
		emp.put(1, "java");
		emp.put(2,"selenium");
		emp.put(3, "Api");
		
		for(Map.Entry<Integer,String> emp1 :emp.entrySet())
		{
			System.out.println(emp1);
		System.out.println(emp1.getKey());
		}
		
		Iterator<Integer> keys = emp.keySet().iterator();
		while(keys.hasNext())
		{
			System.out.println("Keys are :" + keys.next());
		}
		
		
	}
	
}
