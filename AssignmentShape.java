package assignment;

class Shape1{
	 public void print() {
		System.out.println("This is shape");
	}
}
class Rectangle1 extends Shape1{
	public void printR() {
		System.out.println("This is rectangular shape");

	}
}

class Square1 extends Rectangle1{
	public void printS() {
		System.out.println("Square of Rectangle");
	
	}
}

class Circle extends Shape1{
	public void printC() {
	System.out.println("This is Circular shape");

	}
}

public class AssignmentShape {
public static void main(String[] args) {
	Square1 square = new Square1();
	square.print();
	square.printR();
}
}
