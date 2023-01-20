package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
public static void main(String[] args) {
	ArrayList arrayList= new ArrayList<>();
	arrayList.add("SCET");
	arrayList.add("CKPCET");
	arrayList.add("VNSGU");
	arrayList.add("GSEB");
    arrayList.add("CBSE");
    
    System.out.println(arrayList);
    Collections.reverse(arrayList);
    System.out.println(arrayList);
   
   
}
}
