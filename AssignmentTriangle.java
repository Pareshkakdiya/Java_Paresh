package assignment;

class Triangle{
	int s1;
	int s2;
	int s3;
	
	public Triangle() {
	
	}
	
	public double areaOfTriangle(int s1, int s2, int s3) {
	    int s = ((s1+s2+s3)/2);
	    double A = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	    return A;
	}
	
	public int perimeterOfTriangle(int a, int b, int c) {
		return a+b+c;
	}
	
}
public class AssignmentTriangle {
public static void main(String[] args) {
	Triangle triangle = new Triangle();
	System.out.println("Area of area :"+triangle.areaOfTriangle(3,4,5));
	System.out.println("Perimeter of triangle :"+triangle.perimeterOfTriangle(3, 4, 5));
  }
}
