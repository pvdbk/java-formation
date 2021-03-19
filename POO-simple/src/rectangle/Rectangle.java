package rectangle;

public class Rectangle {
	private double a;
	private double b;
	
	public Rectangle(double a, double b) {
		this.setA(a);
		this.setB(b);
	}
	
	public double surface() {
		return this.getA() * this.getB();
	}
	
	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}

	public void setA(double a) {
		this.a = a;
	}
	
	public void setB(double b) {
		this.b = b;
	}
}
