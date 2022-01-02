class Store {
	private int balance = 0;
	private boolean isAvaliable = false;

	public synchronized int get() {
		while(!isAvaliable) {
			try {
				wait();
			}catch(InterruptedException ex){

			}

		}

		isAvaliable = false;
		notifyAll();
		balance--;
		return (1);
	}

	public synchronized void put() {
		while(isAvaliable) {
			try{
				wait();
			}catch(InterruptedException ex) {

			}

		}
		balance++;
		isAvaliable = true; 
		notifyAll();
	}

	public int getValue() {
		return balance;
	}
}

class Producer extends Thread {
	private Store store;

	public Producer(Store store){
		this.store = store;

	}

	public void run() {
		for(int i = 0;i < 10;i++) {
			store.put();
			System.out.println("Producer's done 1. Balance is " + store.getValue());

			try {
				sleep((int)(Math.random( ) * 1000));
			}catch(InterruptedException ex) {

			}

		}
	}
}

class Customer extends Thread {
	private Store store;

	public Customer(Store store) {

		this.store = store;
	}

	public void run() {
		for(int i = 0;i < 5;i++){
			store.get();
			System.out.println("Customer's got 1.Balance is " + store.getValue());
		}
	}
}


public class CustomerBalance {
	public static void main(String[] args) {
		Store store = new Store();
		Producer producer = new Producer(store);
		Customer customer = new Customer(store);
		producer.start();
		customer.start(); 
	}
}