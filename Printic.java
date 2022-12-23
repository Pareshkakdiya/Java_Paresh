package assignment;
class Print{
	public void printIc1(int i, char c) {
		System.out.println("Given integer is "+ i);
		System.out.println("Given character is "+ c);
	}
	
	public void printIc1(char ch, int a) {
		System.out.println("Given integer is "+ a);
		System.out.println("Given character is "+ ch);
	}
}

public class Printic {
public static void main(String[] args) {
	Print p = new Print();
	p.printIc1(85, 'P');
	p.printIc1('R',88);
}
}
