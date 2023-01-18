package assignment;

class MyThread extends Thread{
	public void run() {
		System.out.println("Hello, How are you?");
	}
}

public class ThreadThread {
public static void main(String[] args) {
	MyThread mThread = new MyThread();
	mThread.start();
}
}
