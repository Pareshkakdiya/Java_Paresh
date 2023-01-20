package assignment;

import java.util.ArrayList;

public class Extract {
	public static void main(String[] args) {
		ArrayList arrayList= new ArrayList<>();
		arrayList.add("SCET");
		arrayList.add("CKPCET");
		arrayList.add("VNSGU");
		arrayList.add("GSEB");
	    arrayList.add("CBSE");
	    
	    System.out.println(arrayList);
	    System.out.println(arrayList.subList(0, 2));
	}

}
