package assignment;

class TwinsThread extends Thread{  
      public void run() {
	System.out.println("Have a nice day...!");
}
}

public class ThreadTwice {
public static void main(String[] args) {
	TwinsThread t1 = new TwinsThread();
	
	t1.start();
	t1.start();
}
}
