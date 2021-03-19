package exercicesSimples;

public class exo3 {

	public static void main(String[] args) {
		estimate(5, 3);
		estimate(3, 5);
	}
	
	public static void estimate(int in, int out) {
		int res = in - out;
		if(res >= 0) {
			System.out.println("Profit de " + res + "€");
		} else {
			System.out.println("Perte de " + (-res) + "€");
		}
	}

}
