package somme;

public class Somme {
	private double n1;
	private double n2;
	
	public Somme(double n1, double n2) {
		this.setN1(n1);
		this.setN2(n2);
	}
	
	public double sum() {
		return this.getN1() + this.getN2();
	}
	
	public double getN1() {
		return this.n1;
	}

	public double getN2() {
		return this.n2;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}
	
	public void setN2(double n2) {
		this.n2 = n2;
	}
}
