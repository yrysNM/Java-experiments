public class ThreadSpleep {
	public static void main(String[] args) {
		ThreadWithPause thread = new ThreadWithPause();

		thread.start();
	}
}

class ThreadWithPause extends Thread
{
	public void run() {
		System.out.println("I am here");
		System.out.println("I am out");

		try {
			sleep(3000);
		}catch(InterruptedException ex) {

		} 

		System.out.println("I am back");
	}
}