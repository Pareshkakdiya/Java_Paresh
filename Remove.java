
package assignment;

import java.util.ArrayList;

public class Remove {
public static void main(String[] args) {
	ArrayList upList = new ArrayList();
    upList.add("java");
    upList.add("Orange");
    upList.add("Black");
    upList.add("White");
    upList.add("Wooden");
    
    System.out.println(upList);
    
    upList.remove(2);
    System.out.println(upList);
}
}


