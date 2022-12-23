package assignment;
import java.util.Scanner;
public class MaxNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first value of a:");
		int a = sc.nextInt();
		System.out.println("enter second value of b");
		int b = sc.nextInt();
		System.out.println("enter third value of c");
		int c = sc.nextInt();
		if (a>b) {
			if (a>c) {
				System.out.println("a is grater");
				
			}else {
				System.out.println("c is grater");
			}
			
		}else {
			if (b>c) {
				System.out.println("b is grater");
				
			}else {
				System.out.println("c is grater");
			}
			
		}
		sc.close();
	}

}
