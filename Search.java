
package assignment;

import java.util.ArrayList;

public class Search {
public static void main(String[] args) {
	ArrayList upList = new ArrayList();
    upList.add("java");
    upList.add("Orange");
    upList.add("Black");
    upList.add("White");
    upList.add("Wooden");
    
    System.out.println(upList); 
    
    if (upList.contains("Orange")) {
        System.out.println("Element is available in list");

	} else {
	    System.out.println("Element is not available in list");

	}
    
}
}

