public class TestTwoThread {
	public static void main(String[] args){
		new Horse(1, 6, "Black Horse").start();
		new Horse(1, 6, "White Horse").start();

	}
}

class Horse extends Thread {
	private int from, to;

	public Horse(int from, int to, String title) {
		super(title);
		this.from = from;
		this.to = to;

	}

	public void run() {
		for(int i  = from;i < to;i++){
			System.out.println(getName() + " :move " + i);

			try {
				sleep((long)(Math.random() * 1000));
			}catch(InterruptedException ex ) {

			}

		}
			System.out.println(getName() + " has finished");
	}
}