package exercicesJeux;

import java.util.Scanner;

public class Cesar {

	public static void main(String[] args) {
		try (Scanner entree = new Scanner(System.in)) {
			System.out.println("Message :");
			String message = entree.nextLine();
			System.out.println("Clé :");
			int cle = entree.nextInt();
			StringBuilder chiffre = new StringBuilder("");
			for(int i = 0; i < message.length(); i++) {
				char c = message.charAt(i);
				char limite = (c >= 'a' && c <= 'z') ? 'z' : 'Z';
				if(limite == 'z' || ((c >= 'A') && (c <= 'Z'))) {
					c += cle;
					if (c > limite) {
						c -= 26;					
					}
				}
				chiffre.append(c);
			}
			System.out.println(chiffre.toString());			
		}
	}
}
