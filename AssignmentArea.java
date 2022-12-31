package assignment;

abstract class Shape{
	abstract void RectangleArea(int l, int b);
    abstract void SquareArea(int s);
    abstract void CircleArea(int r);
}

class Area1 extends Shape{
	public void RectangleArea(int l, int b) {
		System.out.println("Area of Rectangle : "+(l*b));
	}
	
	public void SquareArea(int s) {
		System.out.println("Area of Rectangle : "+(s*s));
	}
	
	public void CircleArea(int r) {
		System.out.println("Area of Rectangle : "+(3.14*r*r));
	}
}
public class AssignmentArea {
public static void main(String[] args) {
	Area1 area = new Area1();
	area.RectangleArea(3,6);
	area.SquareArea(3);
	area.CircleArea(4);
}
}
