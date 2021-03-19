package etudiant;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Nom : ");
			String nom = scanner.next();
			System.out.print("note 1 : ");
			int note1 = scanner.nextInt();
			System.out.print("note 2 : ");
			int note2 = scanner.nextInt();
			new Student(nom, note1, note2).show();
		}
	}
}
