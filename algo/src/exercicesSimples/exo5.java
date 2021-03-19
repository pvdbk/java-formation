package exercicesSimples;

public class exo5 {

	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.println("note : " + i);
			estimate(i);
			System.out.println("");
		}
		
	}
	
	public static void estimate(int note) {
		String estimation;
		if (note <= 4) {
			estimation = "Catastrophique, il faut tout revoir";
		} else if (note <= 10) {
			estimation = "Insuffisant";
		} else if (note <= 14) {
			estimation = "Peut mieux faire";
		} else if (note <= 17) {
			estimation = "Bien";
		} else {
			estimation = "Excellent, bon travail";
		}
		System.out.println(estimation);
	}

}
