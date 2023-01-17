package assignment;

import java.util.Scanner;

public class ExceptionMultiple {
public static void main(String[] args) {
	int[] arr = new int[5];
	int i;
	
	try {
		for (i = 0; i <=5; i++) {
			System.out.println("enter value of at index position :"+i);
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			arr[i] = a;
			System.out.println("value at index position : "+i+" is "+arr[i]);
		
	      
			System.out.println("enter value for division :");
			int b = scanner.nextInt();
			
			System.out.println("division of two value : "+arr[i]/b);
			
	  }
	}catch (ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
	}catch (ArithmeticException e) {
		System.out.println(e);
	}

	
	
}
}