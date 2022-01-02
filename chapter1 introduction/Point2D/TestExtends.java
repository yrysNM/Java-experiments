public class TestExtends {
	public static void main(String[] args){
		Point2D point2D1 = new Point2D();

		Point2D point2D2 = new Point2D(1.0, 2.0);

		double r1, r2, s;

		r1 = point2D1.length();

		r2 = point2D2.length();

		s = point2D1.multiply(point2D2);

		System.out.println("Vector " + point2D1.toString());
		System.out.println("Its length is " + r1);
		System.out.println("Vector " + point2D2.toString());
		System.out.println("Its length is " + r2);
		System.out.println("Their scalat multiplication is " + s);

		Point3D point3D1 = new Point3D(); //Creation cordinate(1, 1, 1)
		r1 = point3D1.length();

		Point3D point3D2  = new Point3D(1.0, 2.0, 3.0); //Cor(1, 2, 3)
		r2 = point3D2.length();

		s = point3D1.multiply(point3D2); //vector(1, 1, 1) * (1, 2, 3)

		System.out.println("Vector " + point3D1.toString());
		System.out.println("Its length is " + r1);
		System.out.println("Vector " + point3D2.toString());
		System.out.println("Its length is " + r2);
		System.out.println("Their scalar multiplication is " + s);

		try {
			System.in.read(); 

		}catch(java.io.IOException e) {

		}
	} 
}

class Point2D {
	private double x, y; 

	public Point2D(double x, double y){
		this.x = x;
		this.y = y;

	}

	public Point2D() {
		this(1.0, 1.0);
	}

	public double length() {
		return Math.sqrt(x*x + y * y);
	}

	public double multiply(Point2D p){
		return x * p.x + y * p.y;
	}

	public String toString() {
		return "<" + x + ", " +y + ">";
	}

}

class Point3D extends Point2D {
	private double z;

	public Point3D() {
		super();
		this.z = 1.0;
	}

	public Point3D(double x,  double y, double z) {
		super(x, y);
		this.z = z;
	}

	public double length() {
		double r = super.length();
		r = Math.sqrt(r * r + z * z);

		return z;
	}

	public double multiply(Point3D p) {
		double r = super.multiply(p);
		return r  + z * p.z;
	}

	public String toString() {
		String msg = super.toString();
		msg = msg.substring(0, msg.lastIndexOf('>')) + ", " + z + ">";

		return msg;
	}
}