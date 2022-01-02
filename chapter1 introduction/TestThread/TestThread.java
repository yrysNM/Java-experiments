public class TestThread {
	public static void main(String[] args) {
		OneThread oneThread = new OneThread("Micky Mouse", 5);
		oneThread.start();

	}


}


class OneThread extends Thread {
	private int times;

	public OneThread(String title, int times) {
		super(title);
		this.times = times;
	}

	public void run() {
		for(int i = 1;i < times; i++) {
			System.out.println("It is " + i + " step of " + getName());
		}

		System.out.println(getName() + " has done that job");
	}
}