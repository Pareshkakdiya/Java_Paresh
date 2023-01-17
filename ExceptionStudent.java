package assignment;


import java.util.Scanner;

@SuppressWarnings("serial")
class AgeException extends Exception{
	
//	int age;
//	public AgeException(int age) {
//          this.age = age;
//	}
	
	@Override
	public String getMessage() {
		
		return "AgeNotWithinRangeException";
	}
}

@SuppressWarnings("serial")
class NameException extends Exception{
//	String name;
//	public NameException(String name) {
//		this.name = name;
//	}
	
	@Override
	public String getMessage() {
		
		return "NameNotValidException";
	}
}

class StudentE{
	int rollno;
	String name;
	int age;
	String course;
	
	public StudentE(int rollno, String name, int age, String course) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
		
	}
	
	public void studentAge() throws AgeException {
		if (age > 15 && age < 21) {
			System.out.println("Student age is ok");}
		else {
			   throw new AgeException();
				}
	}
	
	
	
	public void studentName() throws NameException {
	
		int l = name.length();
	    for (int i = 0; i < l; i++) {
	    	char ch = name.charAt(i);
	    	
			if ((ch >= 'A' && ch <= 'Z' ) || (ch >= 'a' && ch <= 'z')) {
				
			}
			
			else {
		             throw new NameException();
	            }
        }
	}
}
public class ExceptionStudent {
public static void main(String[] args) {
	

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter student rollno :");
	int rollno = scanner.nextInt();
	
	System.out.println("Enter student name :");
	String name = scanner.next();
	
	System.out.println("Enter student age :");
	int age = scanner.nextInt();
	
	System.out.println("Enter student course :");
	String course = scanner.next();
	
	scanner.close();
	
	StudentE sE = new StudentE(rollno, name, age, course);
	
	try {
		sE.studentName();
		sE.studentAge();
		System.out.println(rollno+" "+name+" "+age+" "+course);
    }catch (AgeException e) {
	
		e.printStackTrace();
	}catch (NameException e) {

		e.printStackTrace();
	}
		
}
}
