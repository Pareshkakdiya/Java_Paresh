package assignment;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionViewMap {
public static void main(String[] args) {
	HashMap map = new HashMap<>();
	map.put(1, "Virat");
	map.put(2, "Rohit");
	map.put(3, "Ishan");
	map.put(4, "Suryakumar");
	map.put(5, "Hooda");
	
	System.out.println(map);
	System.out.println(map.entrySet());
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.get(3));
	System.out.println(map.remove(3));
    System.out.println(map.entrySet());
	
	Set set = map.entrySet();
	Iterator i1 = set.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
	
}
}
