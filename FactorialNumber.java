package assignment;

import java.util.Scanner;

public class FactorialNumber {
public static void main(String[] args) {
	int fact = 1;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a number : ");
    int n = scanner.nextInt();
    
for (int i = 1; i <= n ; i++) {
	fact = fact*i;
      }
System.out.format("Factorial of given number is :"+fact);
     scanner.close();
   }

}
