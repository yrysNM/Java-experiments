

class NamesTest {
	 void print(String[] words) {
		try {
			Thread.sleep(1000);
		}catch(InterruptedException ex) {

		}

		System.out.println(words[1]);
	} 
}

class MyThread extends Thread {
	Names names;

	MyThread(NamesTest names, String title) {
			super(title);
		this.names = names;
	}

	public void run() {
		synchronized(names) {

			String[] words = {getName() + "1", getName() + "2"};
			names.print(words);
		}
	}
}

public class OperatorSynchronized {
		public static void main(String[] args) {
			NamesTest nm = new  NamesTest();
			new MyThread(nm, "First").start();
			new MyThread(nm, "Second").start();
		}
}