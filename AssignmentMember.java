package assignment;

class Member{
	String datamember;
	String name;
	int age;
	long phonenumber;
	String address;
	int salary;
	
	public void setDatamember(String d) {
		datamember = d;
	}
	public void setName(String n) {
		name = n;
	}
	public void setAge(int a) {
		age = a;
	}
	public void setPhonenumber(long p) {
		phonenumber = p;
	}
	public void setAddress(String a) {
		address = a;
	}
	public void setSalary(int s) {
		salary = s;
	}
	public void printSalary() {
		System.out.println("Employee salary is : "+salary);
	}
	
}
public class AssignmentMember {
public static void main(String[] args) {
	Member member = new Member();
	member.setSalary(20000);
	member.printSalary();
}
}
