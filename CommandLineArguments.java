package assignment;

import java.util.Scanner;

public class CommandLineArguments {
public static void main(String[] args) {
	int a,b,c;
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter first value:");
	a = scanner.nextInt();
	
	System.out.println("enter secod value:");
	b = scanner.nextInt();
	
	try {
		System.out.println("Division of two value :"+a/b);
	} catch (ArithmeticException e) {
		System.out.println(e);
	}
}
}
