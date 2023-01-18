package assignment;

import java.util.ArrayList;

public class Color {
public static void main(String[] args) {
	ArrayList<String> c1 = new ArrayList<>();
	c1.add("Red");
	c1.add("Green");
	c1.add("Blue");
	c1.add("Black");
	c1.add("Purple");
	System.out.println(c1);
	
	for (int i = 0; i < c1.size(); i++) {
		System.out.println(c1.get(i));
	
	}
	
	c1.add(0,"Yellow");
	System.out.println(c1);
	
	System.out.println("Element at position number 3 : "+c1.get(3));
}
}
