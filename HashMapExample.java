package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put(01, "SCET");
	hm.put(02, "CKPCET");
	hm.put(03, "VNSGU");
	hm.put(04, "GSEB");
	hm.put(05, "CBSE");
	
	System.out.println(hm);
	System.out.println(hm.size());
	System.out.println(hm.remove(03));
	System.out.println(hm);
	System.out.println();
	System.out.println(hm.containsKey(1));
	System.out.println(hm.containsValue("me"));
	
	hm.put(03, "BMC");
	System.out.println(hm);
	
	Set set = hm.entrySet();
	Iterator i1 = set.iterator();
	
	while (i1.hasNext()) {
//		System.out.println(i1.next());
		
		Entry me = (Entry) i1.next();	
		System.out.println("key is..."+me.getKey());
		System.out.println("value is..."+me.getValue());
		System.out.println();
			
	}
	boolean result = hm.isEmpty();
	System.out.println(result);
	
	hm.clear();
	boolean result1 = hm.isEmpty();
	System.out.println(result1);
		
}
}
