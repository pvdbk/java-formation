package additionComplexe;

import java.util.Scanner;

public class Test {
	static Scanner scanner;
	
	public static void main(String[] args) {
		try {
			scanner = new Scanner(System.in);
			System.out.println("Premier nombre");
			Complex c1 = saisirComplexe();
			System.out.println();
			System.out.println("Deuxième nombre");
			Complex c2 = saisirComplexe();
			System.out.println();
			System.out.println("La somme est " + c1.add(c2).toString() + ".");
		} finally {
			scanner.close();
		}
	}
	
	public static Complex saisirComplexe()
	{
		System.out.print("Entrez la partie réelle : ");
		double re = scanner.nextDouble();
		System.out.print("Entrez la partie imaginaire : ");
		double im = scanner.nextDouble();
		return new Complex(re, im);
	}
}
