package exercicesSimples;

public class exo8 {

	public static void main(String[] args) {
		scale(5);
	}
	
	public static void scale(int n)
	{
		for(int i = 1; i <= n; i++) {
			String floor = "";
			for(int j = 1; j <= i; j++) {
				floor += "*";
			}
			System.out.println(floor);
		}
	}
}
