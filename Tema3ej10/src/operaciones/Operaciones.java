//Alvaro Contreras Hermida
package operaciones;

import java.util.Scanner;

public class Operaciones {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num1;
		int num2;
		int num3;

		do {
			System.out.println("dime la primera nota");
			num1 = s.nextInt();
		} while (!(num1 > 0 || num1 < 10));

		do {
			System.out.println("dime la segunda nota");
			num2 = s.nextInt();
		} while (!(num2 > 0 || num2 < 10));

		do {
			System.out.println("dime la tercera nota");
			num3 = s.nextInt();
		} while (!(num3 > 0 || num3 < 10));

		double media = (num1 + num2 + num3) / 3;
		System.out.println("La media da " + media);

	}
}
