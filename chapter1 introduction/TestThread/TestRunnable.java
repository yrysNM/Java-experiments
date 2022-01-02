public class TestRunnable {
	public static void main(String[] args) {
		CountThread countThread = new CountThread();

		new Thread(countThread).start();
	}
}

class CountThread implements Runnable {
	public void run() {
		for(int i = 1;i <= 11; i++) {
			System.out.println("Step " + i);
		}
	}
}