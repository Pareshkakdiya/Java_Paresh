package assignment;

import java.util.ArrayList;

public class Update {
public static void main(String[] args) {
	ArrayList uList = new ArrayList();
    uList.add(23);
    uList.add(58);
    uList.add(78);
    uList.add(100);
    uList.add(150);
    System.out.println(uList);
    
    uList.add(2,65);


    ArrayList upList = new ArrayList();
    upList.add("java");
    upList.add("Orange");
    upList.add("Black");
    upList.add("White");
    upList.add("Wooden");
    
    uList.addAll(upList);
    System.out.println(uList);
	}
}
