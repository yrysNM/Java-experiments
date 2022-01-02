 interface Car {
	public String  getName();
	public String getColor();
	public int getCylinders();
}

class Lada implements Car {
	public String getName() {
		return "Lada 8";
	}

	public String getColor() {
		return  "Yellow";
	}

	public int getCylinders() {
		return 4;
	}
}

class BWM implements Car {
	public String getName() {
		return "BWM 600";
	}

	public String getColor(){
		return "RED";
	}

	public int getCylinders(){
		return 8;
	}
}

public class TestInterface {
	
	public static void main(String[] args){
		Lada l = new  Lada();
		BWM b = new BWM();
		printInform(l);
		printInform(b);

		try {System.in.read();}
		catch(java.io.IOException e) {

		}

	}
	public static void printInform(Car c){
		System.out.println("Name: " + c.getName() + " Color: " + c.getColor() + " Cylinders: " + c.getCylinders());
	}

}