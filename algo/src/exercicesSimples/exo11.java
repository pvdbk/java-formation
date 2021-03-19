package exercicesSimples;

public class exo11 {
	
	private static double coins[] = { 500, 200, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };

	public static void main(String[] args) {
		expand(2437.57);
	}
	
	public static void expand(double amount) {
		double a = amount;
		for (double coin : coins) {
			int n = (int) Math.floor(a / coin);
			if(n != 0) {
				System.out.println(((coin >= 5) ? "Billet " : "Pièce ") + coin + "€ : " + n);
				a -= n * coin;
			}
		}
	}
}
