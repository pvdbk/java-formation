package exercicesSimples;

public class exo9 {

	public static void main(String[] args) {
		pyram(4);
	}
	
	public static void pyram(int n)
	{
		recPyram(1, n);
	}
	
	private static void recPyram(int p, int n)
	{
		if(n > 1) {
			logStars(p);
			recPyram(p+1, n-1);
			logStars(p);
		} else {
			logStars(p);
		}
	}
	
	private static void logStars(int n)
	{
		String toLog = "";
		for(int i = 0; i < n; i++) {
			toLog += "*";
		}
		System.out.println(toLog);
	}

}
