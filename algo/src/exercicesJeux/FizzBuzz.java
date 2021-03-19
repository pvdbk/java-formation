package exercicesJeux;

public class FizzBuzz {

	public static void main(String[] args) {
		java.util.Scanner entree =   new java.util.Scanner(System.in);
		System.out.println("Saisissez le nombre maximum :");
		game(entree.nextInt());
		entree.close();
	}
	
	public static void game(int n) {
		for(int i = 1; i <= n; i++) {
			String res = "";
			if(i%3 == 0) res += "Fizz";
			if(i%5 == 0) res += "Buzz";
			if(res == "") res += i;
			System.out.println(res);
		}
	}

}
