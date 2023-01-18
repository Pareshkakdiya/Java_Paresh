package assignment;

import java.util.Scanner;

class MyException extends Exception{
	int amount;
	
	public MyException(int amount) {
		this.amount = amount;
	}
     @Override
    public String getMessage() {
    
    	return "Balance is not sufficient";
    }	
}

public class WithdrawAmount {
	int balance;
	
	public void deposit(int amount) {

	balance = balance+amount;
	System.out.println("Total balance :"+balance);
    
 }
	public void withDraw(int amount) throws MyException {
	
        if (amount < balance) {
			balance = balance - amount; 
			System.out.println("Remaining balance after withdraw is :"+balance);
		}else {
			int need = amount - balance ;
			throw new MyException(need);
		}
		
	}
public static void main(String[] args) {
	WithdrawAmount wAmount = new WithdrawAmount();
	 
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter deposit amount :");
	int amount = scanner.nextInt();
	wAmount.deposit(amount);
	
	try {
		System.out.println("enter withdraw amount");
		int amountW = scanner.nextInt();
		wAmount.withDraw(amountW);
	} catch (MyException e) {
		System.out.println(e.getMessage());
		System.out.println("if you enter "+e.amount+" more in your account you can withdraw");
	}

}
}
