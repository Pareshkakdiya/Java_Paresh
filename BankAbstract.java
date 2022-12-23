package assignment;

abstract class Bank{
	abstract void getBalance();
}

class BankA extends Bank{

	public void getBalance() {
		System.out.println("Deposited : $100");
	}
}

class BankB extends Bank{

	public void getBalance() {
		System.out.println("Deposited : $150");
	}
}

class BankC extends Bank{

	public void getBalance() {
		System.out.println("Deposited : $200");
	}
}

public class BankAbstract {
public static void main(String[] args) {
	
	BankA bankA = new BankA();
	bankA.getBalance();
	
	BankB bankB = new BankB();
	bankB.getBalance();
	
	BankC bankC = new BankC();
	bankC.getBalance();
    }
}
