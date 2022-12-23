package assignment;
class PrintN{

	
	public int printLn(int a) {
		return a;
	}
	
	public float printLn(float f) {
		return f;
	}


public double printLn(double d) {
	return d;
    }


public long printLn(long l) {
	return l;
    }
}

public class PrintNumber {
public static void main(String[] args) {
	PrintN printN = new PrintN();
	System.out.println(printN.printLn(76));
    System.out.println(printN.printLn(0.213f));
	System.out.println(printN.printLn(456.5646d));
	System.out.println(printN.printLn(1564566l));
  }
}
