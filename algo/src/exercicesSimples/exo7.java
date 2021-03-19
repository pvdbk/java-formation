package exercicesSimples;

public class exo7 {

	public static void main(String[] args) {
		sum(10);
	}
	
	public static void sum(int n) {
		int res = 0;
		for(int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println(res);
	}

}
