
package assignment;

import java.util.ArrayList;

import java.util.Collections;




public class Sort {
	public static void main(String[] args) {
		ArrayList<String> upList = new ArrayList<>();
	    upList.add("Red");
	    upList.add("Orange");
	    upList.add("Black");
	    upList.add("White");
	    upList.add("Wooden");
	    
	    System.out.println(upList);
	    Collections.sort(upList);
	    System.out.println(upList);
	  }
}

