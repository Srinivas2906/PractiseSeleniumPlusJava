package Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaptest {

	public static void main(String[] args) {

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "hello");
		hm.put(2,"world");
		hm.put(3, "value");
		hm.put(4, "hello");
		
		for(Map.Entry<Integer, String> m: hm.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
