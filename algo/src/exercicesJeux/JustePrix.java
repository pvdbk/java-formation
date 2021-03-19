package exercicesJeux;

public class JustePrix {

	public static void main(String[] args) {
		java.util.Scanner entree = new java.util.Scanner(System.in);
		try {
			System.out.print("Saisissez le nombre de vies : ");
			int nbLives = entree.nextInt();
			System.out.print("Saisissez le nombre maximum : ");
			int max = entree.nextInt();
			int secret = (int) Math.random()*(max+1);
			int proposal = -1;
			int i;
			for(i = 0; i < nbLives && secret != proposal; i++) {
				System.out.print("Essayez : ");
				proposal = entree.nextInt();
				if( secret < proposal) {
					System.out.println("Moins");
				} else if (secret > proposal) {
					System.out.println("Plus");
				}
			}
			if(secret != proposal) {
				System.out.println("Perdu !");
			} else {
				System.out.println("Gagné avec " + (nbLives-i+1) + " vie(s) conservée(s) !");
			}
		} finally {
			entree.close();
		}
	}

}
