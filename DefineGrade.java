package assignment;

import java.util.Scanner;

public class DefineGrade {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter marks out of 100");
	int a = scanner.nextInt();
	
if (a>=91 && a<=100) {
	System.out.println("Grade : A");
}else if (a>=81 && a<=90) {
	System.out.println("Grade : B");
}else if (a>=71 && a<=80) {
	System.out.println("Grade : B");
}else if (a>=61 && a<=70) {
	System.out.println("Grade : C");
}else if (a>=51 && a<=60) {
	System.out.println("Grade : D");
}else if (a>=41 && a<=50) {
	System.out.println("Grade : DD");
}else {
	System.out.println("Fail");
      }
   }
}
