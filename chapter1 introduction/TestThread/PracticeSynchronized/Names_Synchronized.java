class Names {
	synchronized void print(String[] words) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {

		}

		System.out.println(java.util.Arrays.toString(words));
	} 
}

class MyThread extends Thread {
	Names names; 

	MyThread(Names names, String title) {
			super(title);
		this.names = names;
	}

	public void run() {
		String[] words = {getName() + "1", getName() + "2"};
		names.print(words);
	}
}

public class Names_Synchronized {
		public static void main(String[] args) {
			Names nm = new  Names();
			new MyThread(nm, "First").start();
			new MyThread(nm, "Second").start();
		}
} 