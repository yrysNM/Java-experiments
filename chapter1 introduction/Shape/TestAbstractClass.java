import java.awt.Point;

abstract class Shape{
	public abstract double circumference();
}

class Circle extends Shape {
	protected double r;
	protected static final double PI = Math.PI;

	public Circle() {
		this(1.0);
	}

	public Circle(double r){
		this.r = r;
	}

	public double getRadius() {
		return r;
	} 

	public double circumference() {
		return 2 * PI * r;
	}
}

class Triangle extends Shape {
	protected Point pointA, pointB, pointC;

	public Triangle() {
		this(new Point(0, 0), new Point(1, 0), new Point(0, 1));
	}

	public Triangle(Point pointA, Point pointB, Point pointC) {
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;

	}

	public double circumference() {
		return (this.getSideAB() + this.getSideBC() + this.getSideAC());
	}

	public double getSideAB() {
		return Math.sqrt((pointB.x - pointA.x) * (pointB.x - pointA.x) + (pointB.y - pointA.y) * (pointB.y - pointA.y));
	}

	public double getSideBC() {
		return Math.sqrt((pointC.x - pointB.x) * (pointC.x - pointB.x) + (pointC.y - pointB.y) * (pointC.y - pointB.y));
	}

	public double getSideAC() {
			return Math.sqrt((pointC.x - pointA.x) * (pointC.x - pointA.x) + (pointC.y - pointA.y) * (pointC.y - pointA.y));
	}
}

public class TestAbstractClass {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(2.0);
		shapes[1] = new  Triangle(new Point(0 , 0), new Point(1 , 0), new Point(1,1));

		for(int i = 0; i < shapes.length; i++){
			System.out.println("Circumference of shape " + i + " is " + shapes[i].circumference());
		}
	}
}