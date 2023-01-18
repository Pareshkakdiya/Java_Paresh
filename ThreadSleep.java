package assignment;

class FirstThread extends Thread{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("This is my first thread..."+i);
		}
		
	}
}

class SecondThread extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("This is my second thread..."+i);
		}
		
	}
}

public class ThreadSleep {
public static void main(String[] args) {
	FirstThread f1 = new FirstThread();
	SecondThread s1 = new SecondThread();
	f1.start();
//	try {
//		f1.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	s1.start();
}
}
