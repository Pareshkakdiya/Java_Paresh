package assignment;

abstract class Parent1{
	abstract public void message();
}

class Child1 extends Parent1{
	public void message() {
		System.out.println("This is First Subclass");
	}
}

class child2 extends Parent1{
	public void message() {
		System.out.println("This is Second Subclass");
	}
}

public class AbstractParent {
public static void main(String[] args) {

	Child1 child1 = new Child1();
	child1.message();
	
	child2 child2 = new child2();
	child2.message();

   }
}
