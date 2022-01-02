 class ComplexNumber {
	private double real;
	private  double image; 

	public ComplexNumber(double real, double image) {
		this.real = real;
		this.image = image;
	}

	public ComplexNumber(double real) {
		this(real, 0.0);
	}

	public ComplexNumber add(ComplexNumber cn){
		return new ComplexNumber(real + cn.real, image + cn.image);
	}

	public String toString() {
		String msg;
		msg = "(" + real + ", " + image + ")";

		return msg; 
	}
}

public class TestComplexNumber {
	public static void main(String[] args){
		ComplexNumber cn1 = new  ComplexNumber(1.0, 7.0);
		ComplexNumber cn2 = new ComplexNumber(5.0);

		ComplexNumber res = cn1.add(cn2);

		System.out.println(cn1.toString() + " +  " + cn2.toString() + "  = " + res.toString()); 
	}
}
