package assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ReplaceElement {
public static void main(String[] args) {
	ArrayList rp = new ArrayList<>();
	rp.add("Reliance");
	rp.add("Adani");
	rp.add("Godrej");
	rp.add("Tesla");
	
	System.out.println(rp);
	Collections.replaceAll(rp, "Tesla", "L&T");
	
	System.out.println(rp);
}
}
