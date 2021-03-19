package exercicesJeux;

import java.util.Scanner;

public class Morpion {
	public static void main(String[] args) {
		try (Scanner entree = new Scanner(System.in)) {
			int joueur = 1;
			int grille[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
			int gagnant = 0;
			do {
				System.out.println("Joueur " + joueur);
				int l, c;
				boolean choisir = true;
				do {
					System.out.print("Ligne : ");
					l = entree.nextInt() - 1;
					System.out.print("Colonne : ");
					c = entree.nextInt() - 1;
					choisir = l < 0 || l > 2 || c < 0 || c > 2 || grille[l][c] != 0;
					if(choisir) {
						System.out.println("...");						
					}
				} while(choisir);
				grille[l][c] = joueur;
				afficher(grille);
				joueur = 3 - joueur;
				gagnant = teste(grille, l, c);
			} while(gagnant == 0);
			System.out.println("Le joueur " + gagnant + " a gagné.");
		}
	}
	
	private static void afficher(int grille[][]) {
		for(int l = 0; l < 3; l++) {
			String str = "";
			for(int c = 0; c < 3; c++) {
				int joueur = grille[l][c];
				str += joueur == 1 ? "X" : joueur == 2 ? 'O' : '-';
			}
			System.out.println(str);
		}
	}
	
	private static int teste(int grille[][], int l, int c) {
		int ret = testeDiagonales(grille, l, c);
		return ret != 0 ? ret : testeLignesDroites(grille, l, c);
	}
	
	private static int testeLignesDroites(int grille[][], int l, int c) {
		int ret = testeAlignement(grille, l, 0, 0, 1);
		return ret != 0 ? ret : testeAlignement(grille, 0, c, 1, 0);
	}
		
	private static int testeDiagonales(int grille[][], int l, int c) {
		int ret = l == c ? testeAlignement(grille, 0, 0, 1, 1) : 0;
		return ret != 0 ? ret : (
			l+c == 2 ? testeAlignement(grille, 2, 0, -1, 1) : 0
		);
	}

	private static int testeAlignement(int grille[][], int l, int c, int dl, int dc) {
		int joueur = grille[l][c];
		return (grille[l+dl][c+dc] == joueur && grille[l+2*dl][c+2*dc] == joueur) ? joueur : 0;
	}
}
