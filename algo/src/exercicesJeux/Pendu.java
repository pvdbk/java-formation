package exercicesJeux;

public class Pendu {

	public static void main(String[] args) {
		java.util.Scanner entree = new java.util.Scanner(System.in);
		try {
			System.out.print("Saisissez un mot : ");
			String secret = entree.next();
			StringBuilder alreadyFound = new StringBuilder("");
			for(int i = 0; i < secret.length(); i++) {
				alreadyFound.append('_');
			} 
			System.out.print("Saisissez le nombre de vies : ");
			int nbLives = entree.nextInt();
			boolean won = false;
			while(nbLives > 0 && !won) {
				char c = entree.next().charAt(0);
				boolean charOk = false;
				for(int i = 0; i < secret.length(); i++) {
					if (secret.charAt(i) == c) {
						alreadyFound.setCharAt(i, c);
						charOk = true;
					};
				}
				if(!charOk) {
					nbLives--;
				}
				won = secret.equals(alreadyFound.toString());
				System.out.println(alreadyFound.toString());
			}
			if(won) {
				System.out.println("Gagné avec " + nbLives + " vie(s) conservée(s) !");
			} else {
				System.out.println("Perdu !");
			}
		} finally {
			entree.close();
		}
	}

}
