package simple;

// dong ghi chu
// ghi chu tu vsc
public class ThreadSimple extends Thread {

	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		ThreadSimple t1 = new ThreadSimple();
		t1.start();

	}

}
