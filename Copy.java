package assignment;

import java.util.ArrayList;
import java.util.Collections;



public class Copy {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	ArrayList a1 = new ArrayList();
	a1.add(5);
	a1.add(10);
	a1.add(15);
	a1.add(20);
	a1.add(25);
	
	System.out.println(a1);
	
	ArrayList a2 = new ArrayList();
	a2.add(30);
	a2.add(35);
	a2.add(40);
	a2.add(45);
	a2.add(50);
	
	System.out.println(a2);
	
	Collections.copy(a2, a1);
	
	System.out.println(a2);
	
}
}
