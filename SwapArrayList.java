package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {
public static void main(String[] args) {
	ArrayList sArrayList= new ArrayList();
	sArrayList.add("Ishan");
	sArrayList.add("Rohit");
	sArrayList.add("Virat");
	sArrayList.add("Surya");
	sArrayList.add("Hardik");
	sArrayList.add("Ashwin");
	
	System.out.println(sArrayList);
	Collections.swap(sArrayList, 3, 4);
	System.out.println(sArrayList);
	Collections.swap(sArrayList, 1, 2);
	System.out.println(sArrayList);
}
}
