package exercicesSimples;

public class exo10 {

	public static void main(String[] args) {
		pyram(4);
	}
	
	public static void pyram(int n) {
		String spaces = "";
		String stars = "*";
		for(int i = 0; i < n; i++) {
			spaces += "-";
		}
		for(int i = 0; i < n; i++) {
			spaces = spaces.substring(1, n-i);
			System.out.println(spaces + stars);
			stars += "**";
		}
	}

}
