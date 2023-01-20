package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
public static void main(String[] args) {
	ArrayList r1 = new ArrayList<>();
	r1.add("java");
	r1.add("Paresh");
	r1.add(38);
	r1.add(19.05);
	r1.add(100000);
	
	System.out.println(r1);
	Collections.shuffle(r1);
	System.out.println(r1);
}
}
