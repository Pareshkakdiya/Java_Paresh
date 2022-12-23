package assignment;



class Rectangle{
	int length;
	int breadth;
	
	public Rectangle() {}
	
	public Rectangle(int l, int b) {
		 length = l;
		 breadth = b;
		
	}
	
	public void area() {
	System.out.println("Area of Rectangle : "+length*breadth);
	}
	
	public void perimeter() {
		System.out.println("Perimeter of Rectangle : "+2*(length*breadth));
	}
}

class Square extends Rectangle{
	int s;
	
	public Square() {
		// TODO Auto-generated constructor stub
	}
	
	public Square(int s){
      super(s,s);
      super.area();
      super.perimeter();
	  this.s = s;
	 
	}
	
	public void area() {
		System.out.println("Area of Square : "+s*s);
	}
	
	public void perimeter() {
		System.out.println("Perimeter of Square : "+4*s);
	}
	}

public class InheritanceAP {
public static void main(String[] args) {
//	Rectangle rectangle = new Rectangle(25,50);
//	rectangle.area();
//	rectangle.perimeter();
	
	Square square = new Square(25);
	square.area();
	square.perimeter();

	
}
}
