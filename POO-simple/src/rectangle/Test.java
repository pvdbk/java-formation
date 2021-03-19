package rectangle;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("a : ");
			double a = scanner.nextDouble();
			System.out.print("b : ");
			double b = scanner.nextDouble();
			System.out.println("Surface : " + new Rectangle(a, b).surface());
		}
	}
}
