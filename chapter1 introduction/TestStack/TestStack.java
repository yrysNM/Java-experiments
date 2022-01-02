import java.util.Stack;

public class TestStack {
	public static void main(String[] args){
		if(args.length != 2) {
			System.out.println("There are only two arguments. \n" + 
					"The first one is a number.The second one is the base");

			return;
		}

		int number = Integer.parseInt(args[0]);
		int base = Integer.parseInt(args[1]);

		if((base <= 0) || (base >= 10)) {
			System.out.println("The base  must be  within [1,10]");
		}else {
			MultibaseTransfer mt = new MultibaseTransfer();
			System.out.println(mt.PerformMultibaseTransfer(number, base));
		}
	}
}

class MultibaseTransfer {
	String inn;
	Stack st = new Stack();
	MultibaseTransfer() {

	}

protected String PerformMultibaseTransfer(int number, int base) {
		do {
			try {
				st.push(new Integer(number % base));
			}catch(NullPointerException ex) {
				System.out.println("it cannot be pushed to the stack " + ex.toString());
			}

			try{
				number /= base;
			} 
			catch(ArithmeticException a_ex){
				System.out.println("b == 0" + a_ex.toString());
			}
		}
		while(number != 0);

			try {
				inn = "";
				while(!st.isEmpty()) {
					inn += st.pop();
				}
			}catch(NullPointerException ex) {
					System.out.println("it cannot be popped out of the stack " + ex.toString());
			}

		return inn;
	}
}