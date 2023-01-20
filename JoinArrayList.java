package assignment;

import java.util.ArrayList;

public class JoinArrayList {
public static void main(String[] args) {
	ArrayList sArrayList= new ArrayList();
	sArrayList.add("Ishan");
	sArrayList.add("Rohit");
	sArrayList.add("Virat");
	sArrayList.add("Surya");
	sArrayList.add("Hardik");
	sArrayList.add("Ashwin");
	
	ArrayList sArrayList2 = new ArrayList();
	sArrayList2.add("Yuzwedra");
	sArrayList2.add("Siraj");
	sArrayList2.add("Umran");
	sArrayList.add("Shardul");
	sArrayList2.add("Akhar");
	
	sArrayList.addAll(sArrayList2);
	System.out.println(sArrayList);
}
}
