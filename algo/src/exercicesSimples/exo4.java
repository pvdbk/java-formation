package exercicesSimples;

public class exo4 {
	
	public static void main(String[] args) {
		int[] a = { 12, -3, 2, 4, 20, 1 };
		System.out.println(max(a));
	}

	public static int max(int[] argArray) {
		int ret = Integer.MIN_VALUE;
		for(int val: argArray) {
			if(val > ret) {
				ret = val;
			}
		}
		return ret;
	}
}
