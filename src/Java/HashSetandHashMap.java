package Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import junit.framework.Assert;

public class HashSetandHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(1, "java");
		hs.put(2, "sql");
		hs.put(1, "selenium");
		hs.put(1, "api");
		hs.put(4,"api");
		
		Set es= hs.entrySet();
		Iterator it = es.iterator();
		while(it.hasNext())
		{
			Map.Entry mp =(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
	
		Set<Integer> keys =hs.keySet();
		
		for(int i : keys)
		{
			System.out.println("i"+ i +"values"+hs.values());

		}
	
	}
}
