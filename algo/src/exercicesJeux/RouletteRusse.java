package exercicesJeux;

import java.util.Scanner;

public class RouletteRusse {

	public static void main(String[] args) {
		Scanner entree = new Scanner(System.in);
		try {
			
			int nbBullets;
			do {
				System.out.print("Saisissez un nombre de balles (8 maximum) : ");
				nbBullets = entree.nextInt();				
			} while (nbBullets < 1 && nbBullets > 8);
			int gamer = 1;
			while (Math.random() > nbBullets/8.0) {
				gamer = 3-gamer;
			}
			System.out.println("Le joueur " + gamer + " ne jouera plus.");
		} finally {
			entree.close();
		}
	}

}
