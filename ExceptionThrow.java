package assignment;


import java.util.Scanner;

//class AgeException extends Exception{
//
//	@Override
//	public String getMessage() {
//		
//		return "You are not eligible for vote";
//	}
//}

public class ExceptionThrow {
	
	public void age() throws ArithmeticException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the age of person :");
	    int age = scanner.nextInt();
		if (age >=18) {
			System.out.println("Welcome, You are eligible of vote");
		}else {

          throw new ArithmeticException();
		}
	}
public static void main(String[] args) {
	ExceptionThrow eThrow = new ExceptionThrow();
	try {
		eThrow.age();
	} catch (ArithmeticException e) {
        System.out.println(e);
	}
}
}
