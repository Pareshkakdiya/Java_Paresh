package assignment;

import java.util.Scanner;

class Division{
	public void divide(int a, int b) {
	
		System.out.println("Division of given two value is :"+a/b);
   }
}

public class ExceptionDivision {
public static void main(String[] args) {
	Division division = new Division();
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter value of a :");
	int x = scanner.nextInt();
	
	System.out.println("enter value of b :");
	int y = scanner.nextInt();

	
	try {
		division.divide(x, y);
	} catch (Exception e) {
		System.out.println(e);
	}


   }
}
