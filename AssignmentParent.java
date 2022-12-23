package assignment;
 
class Parent{
	public void display1() {
		System.out.println("This is a parent class");
	}
}

class Child extends Parent{
	public void display2() {
		System.out.println("This is child class");
	}
}
public class AssignmentParent {
public static void main(String[] args) {
	Parent parent = new Parent();
	parent.display1();
	
	Child child = new Child();
	child.display2();
	child.display1();
}
}
