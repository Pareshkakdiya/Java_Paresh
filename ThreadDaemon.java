package assignment;

class Paresh extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello, Good morning Paresh..."+i);
		}
		
	}
}

class Daemon extends Thread{
   public void run() {
	if (Thread.currentThread().isDaemon()) {
		System.out.println("Thread is Daemon...");
	}else {
		System.out.println("user thread work...");
	}
}
}

public class ThreadDaemon {
public static void main(String[] args) {
	Paresh p1 = new Paresh();
	Daemon d1 = new Daemon();
	Daemon d2 = new Daemon();
	Daemon t1 = new Daemon();
//	p1.start();
	
	d1.setDaemon(true);
	d1.start();
	d2.start();
	t1.start();
}
}
