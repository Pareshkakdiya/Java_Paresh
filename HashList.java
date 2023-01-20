package assignment;

import java.util.HashSet;
import java.util.Iterator;

public class HashList {
public static void main(String[] args) {
      HashSet hl = new HashSet<>();
      hl.add("Paresh");
      hl.add(38);
      hl.add("Reenal");
      hl.add(35);
      hl.add("Prajval");
      hl.add(11);
      
      System.out.println(hl);
      
      Iterator i1 = hl.iterator();
      while (i1.hasNext()) {
	      System.out.println(i1.next());
	      
	}
}
}
