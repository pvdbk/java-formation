package exercicesSimples;

public class exo12 {

	public static void main(String[] args) {
		int t[] = { 12, 25, 5, 7, 6, -5, 5, 30 };
		near0(t);
	}
	
	public static void near0(int[] temps) {
		if(temps.length > 0) {
			int ret = Integer.MAX_VALUE;
			for(int temp : temps) {
				int absTemp = Math.abs(temp);
				int absRet = Math.abs(ret);
				if(absTemp < absRet || (absTemp == absRet && temp < 0)) {
					ret = temp;
				}
			}
			System.out.println("La température la plus proche de 0°C est " + ret + "°C.");
		}
	}

}
