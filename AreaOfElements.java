package assignment;

class Area{
	int side;
	int length;
	int breadth;
	
	public void setData(int a) {
		side = a;
	}
	
	public void setData(int l, int b) {
		length = l;
		breadth = b;
	}
	
	public void areaOfSquare() {
		System.out.println("Area of square is :"+side*side);
	}
	
	public void areaOfRectangle() {
		System.out.println("Area of rectangle is :"+length*breadth);
	}
}

public class AreaOfElements {
public static void main(String[] args) {
	Area area = new Area();
	area.setData(15);
	area.setData(5, 9);
	area.areaOfSquare();
	area.areaOfRectangle();
}
}
