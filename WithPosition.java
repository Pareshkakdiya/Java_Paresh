package assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class WithPosition {
public static void main(String[] args) {
	ArrayList rp = new ArrayList();
	rp.add("Reliance");
	rp.add("Adani");
	rp.add("Godrej");
	rp.add("Tesla");
	
	for (int i = 0; i < rp.size(); i++) {
		System.out.print(i);
		System.out.println(" "+rp.get(i));
	}
//		Iterator i1 = rp.iterator();
//		while (i1.hasNext()) {
//			System.out.println(i1.next());
//			
//		}
	

	}
}

