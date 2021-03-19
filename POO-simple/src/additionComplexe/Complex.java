package additionComplexe;

public class Complex {
	private double re;
	private double im;
	
	public Complex(double re, double im) {
		this.setRe(re);
		this.setIm(im);
	}
	
	public Complex add(Complex c) {
		return new Complex(this.getRe()+c.getRe(), this.getIm()+c.getIm());
	}
	
	public String toString() {
		return this.getRe() + " + " + this.getIm() + "i";
	}

	public double getRe() {
		return this.re;
	}

	public double getIm() {
		return this.im;
	}

	public void setRe(double re) {
		this.re = re;
	}
	
	public void setIm(double im) {
		this.im = im;
	}
}
