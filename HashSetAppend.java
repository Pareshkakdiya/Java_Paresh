package assignment;

import java.util.Collections;
import java.util.HashSet;

public class HashSetAppend {
	public static void main(String[] args) {
		HashSet h1 = new HashSet();
		h1.add("Paresh");
		h1.add("Tops");
		h1.add("Technologies");
		h1.add(12);
		h1.add("Paresh");
		
		System.out.println(h1);
		// Duplication not allowed
        // Order does not maintain which we given       		
		
		h1.add("Kakadiya");
		
		System.out.println(h1);
	}

}
