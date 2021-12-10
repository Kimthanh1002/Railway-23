package Enity;

public class Rectangle implements IRectangle{
		private double a;
		private double b;

	@Override
	public double area() {
		double area = a*b;
	return area;
		
	}

	@Override
	public double perimeter() {
		double perimeter = (a+b)*2;
		return perimeter;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

}
