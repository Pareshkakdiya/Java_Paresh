package assignment;


import java.util.Scanner;

abstract class Marks{
      abstract void getPercentage();
}

class StudentA extends Marks{
	public void getPercentage() {
		int sum = 0;
		
	for (int i = 0; i < 3; i++) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks for each subject out of 100");
		 int a = scanner.nextInt();
		 sum = sum + a;
		}
	 float avg = (sum/3);
	 System.out.println("Average of total three subject's marks is :"+avg+"%");
	}
}

class StudentB extends Marks{
	public void getPercentage() {
		int sum = 0;
		float avg;
	for (int i = 0; i < 4; i++) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter marks for each subject out of 100");
		 int b = scanner.nextInt();
		 sum = sum + b;
		 }
	avg = (sum/4);
	 System.out.println("Average of total four subject's marks is :"+avg+"%");
	}
}
public class MarksAbstract {
public static void main(String[] args) {
	StudentA studentA = new StudentA();
	studentA.getPercentage();
	
	StudentB studentB = new StudentB();
	studentB.getPercentage();
}
}
