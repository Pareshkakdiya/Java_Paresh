package assignment;


import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for ( i = 1; i <= 5; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a number :"+i);
			int in = sc.nextInt();
			sum = sum + in;  
		}
		
		
		float avg = sum/ 5;
		System.out.println("The sum of 5 no is :"+sum);
		System.out.println("The avg of 5 no is :"+avg);

		
	}

}
