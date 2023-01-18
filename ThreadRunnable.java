package assignment;

class First implements Runnable{
  public void run() {
	System.out.println("Good Morning...");
}
}
public class ThreadRunnable {
public static void main(String[] args) {
	First f1 = new First();
	Thread t1 = new Thread(f1);
	t1.start();
}
}

