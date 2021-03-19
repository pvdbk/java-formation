package exercicesJeux;

import java.util.Scanner;

public class RouletteCasino {
	
	private static Scanner scanner;
	private static final String NUMERO = "numéro";
	private static final String LIGNE = "ligne";
	private static final String COLONNE = "colonne";
	private static final String INTERLIGNE = "interligne";
	private static final String INTERCOLONNE = "intercolonne";
	private static final String TIERS = "tiers";
	private static final String DOUBLE_TIERS = "double tiers";
	
	public static void main(String[] args) {
		try {
			scanner = new Scanner(System.in);
			System.out.print("Combien possédez vous ? ");
			double possession = scanner.nextDouble();
			double mise = demandeMise();
			while (mise <= possession) {
				possession += gain(mise);
				System.out.println("Il vous reste " + possession + ".");
				mise = demandeMise();
			}
			System.out.println("A plus.");
		} finally {
			scanner.close();
		}
	}

	private static double gain(double mise) {
		System.out.println("1 : Plein");
		System.out.println("2 : Transversale");
		System.out.println("3 : Cheval");
		System.out.println("4 : Sixain");
		System.out.println("5 : Carré");
		System.out.println("6 : Douzaine");
		System.out.println("7 : Douzaine à cheval");
		System.out.println("8 : Colonne");
		System.out.println("9 : Colonne à cheval");
		int[] pari = new int[0];
		double mul = 0;
		switch (choisir("mode de jeu")) {
			case 1:
				pari = plein();
				mul = 35;
				break;
			case 2:
				pari = transversale();
				mul = 11;
				break;
			case 3:
				pari = cheval();
				mul = 17;
				break;
			case 4:
				pari = sixain();
				mul = 5;
				break;
			case 5:
				pari = carre();
				mul = 8;
				break;
			case 6:
				pari = douzaine();
				mul = 2;
				break;
			case 7:
				pari = douzaineCheval();
				mul = 0.5;
				break;
			case 8:
				pari = colonne();
				mul = 2;
				break;
			case 9:
				pari = colonneCheval();
				mul = 0.5;
				break;
		}
		return gagne(pari) ? mul*mise : -mise;
	}
	
	private static double demandeMise() {
		System.out.println();
		System.out.print("Mise : ");
		return scanner.nextDouble();
	}

	private static boolean gagne(int pari[]) {
		String message = "Numéros pariés :";
		for(int i = 0; i < pari.length; i++) {
			message += " " + pari[i];
		}
		System.out.println(message);
		int num = (int) (Math.random() * 37);
		System.out.println("Numéro tiré : " + num);
		boolean ret = false;
		for(int i = 0; i < pari.length && !ret; i++) {
			ret = pari[i] == num;
		}
		return ret;
	}

	private static int choisir(String nom) {
		int saisie = 0;
		int max = nom.equals(NUMERO)
			? 36
			: nom.equals(LIGNE)
			? 12
			: nom.equals(COLONNE) || nom.equals(TIERS)
			? 3
			: nom.equals(INTERLIGNE)
			? 11
			: nom.equals(INTERCOLONNE) || nom.equals(DOUBLE_TIERS)
			? 2
			: 9;
		do {
			System.out.print("Choisissez votre " + nom + " (1-" + max + ") : ");
			saisie = scanner.nextInt();
		} while (saisie < 1 || saisie > max);
		return saisie;
	}

	private static int[] plein() {
		int ret[] = new int[1];
		ret[0] = choisir(NUMERO);
		return ret;
	}
	
	private static int[] transversale() {
		int ret[] = new int[3];
		int num = 3*choisir(LIGNE) - 3;
		for(int i = 0; i < 3; i++) {
			ret[i] = ++num;
		}
		return ret;
	}

	private static int[] cheval() {
		int ret[] = new int[2];
		int num =  3*choisir(LIGNE) + choisir(INTERCOLONNE) - 3;
		ret[0] = num;
		ret[1] = num+1;
		return ret;
	}
	
	private static int[] sixain() {
		int ret[] = new int[6];
		int num =  3*choisir(INTERLIGNE) - 2;
		for(int i = 0; i < 6; i++) {
			ret[i] = num++;
		}
		return ret;
	}

	private static int[] carre() {
		int ret[] = new int[4];
		int num =  3*choisir(INTERLIGNE) + choisir(INTERCOLONNE) - 3;
		ret[0] = num;
		ret[1] = num+1;
		ret[2] = num+3;
		ret[3] = num+4;
		return ret;
	}

	private static int[] douzaine() {
		int ret[] = new int[12];
		int num =  12*choisir(TIERS) - 11;
		for(int i = 0; i < 12; i++) {
			ret[i] = num++;
		}
		return ret;
	}
	
	private static int[] douzaineCheval() {
		int ret[] = new int[24];
		int num =  12*choisir(DOUBLE_TIERS) - 11;
		for(int i = 0; i < 24; i++) {
			ret[i] = num++;
		}
		return ret;
	}

	private static int[] colonne() {
		int ret[] = new int[12];
		int num =  choisir(COLONNE);
		for(int i = 0; i < 12; i++) {
			ret[i] = num;
			num += 3;
		}
		return ret;
	}
	
	private static int[] colonneCheval() {
		int ret[] = new int[24];
		int num =  choisir(INTERCOLONNE);
		for(int i = 0; i < 12; i++) {
			ret[2*i] = num++;
			ret[2*i + 1] = num;
			num += 2;
		}
		return ret;
	}
}
