package points;

import java.util.Scanner;

public class Test {
	static Scanner scanner;
	
	public static void main(String[] args) {
		try {
			scanner = new Scanner(System.in);
			System.out.println("Premier point");
			Point p1 = saisirPoint();
			System.out.println();
			System.out.println("Deuxième point");
			Point p2 = saisirPoint();
			System.out.println();
			System.out.println("La distance entre le deux est de " + p1.distance(p2) + ".");
		} finally {
			scanner.close();
		}
	}
	
	public static Point saisirPoint()
	{
		System.out.print("x : ");
		double x = scanner.nextDouble();
		System.out.print("y : ");
		double y = scanner.nextDouble();
		return new Point(x, y);
	}
}
