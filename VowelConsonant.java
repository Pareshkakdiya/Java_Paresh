package assignment;

import java.util.Scanner;

public class VowelConsonant {
     public static void main(String[] args) {
	    char ch = 'D';
		if (ch<'A' || ch>'z') {          //65 90 97 122
			System.out.println("enter input invalid");
		}else {
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E' ||ch=='I' || ch=='O' || ch=='U') {
				System.out.println("letter is vowel");
			}else {
				System.out.println("letter is consonant");
			}
		}
	}

}