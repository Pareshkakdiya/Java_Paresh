package assignment;

import java.util.Scanner;

public class VowelConsonant {
     public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("enter character : ");
	    char ch = scanner.next().charAt(0);
	    
		if (ch<'A' || ch>'z') {          //65 90 97 122
			System.out.println("enter input invalid");
		}else {
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E' ||ch=='I' || ch=='O' || ch=='U') {
				System.out.println("letter is vowel");
			}else {
				System.out.println("letter is consonant");
			}
		}
		scanner.close();
	}

}