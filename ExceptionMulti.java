package assignment;

import java.util.Scanner;

public class ExceptionMulti {
public static void main(String[] args) {
	int[] marks = new int[3];
	marks[0] = 45;
	marks[1] = 67;
	marks[2] = 85;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter index position :");
	int ind = scanner.nextInt();
	try {
		try {
		    System.out.println("value at given index : "+marks[ind]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("enter value for division :");
		int a = scanner.nextInt();
		
		System.out.println("Division of two given value :"+marks[ind]/a);
	} catch (ArithmeticException e) {
		System.out.println(e);
	}

}
}
