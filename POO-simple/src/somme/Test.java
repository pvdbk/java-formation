package somme;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("n1 : ");
			double n1 = scanner.nextDouble();
			System.out.print("n2 : ");
			double n2 = scanner.nextDouble();
			System.out.println("Somme : " + new Somme(n1, n2).sum());
		}
	}
}
