package controle.desafios;

import java.util.Scanner;

public class PrimeiroDesafio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a <= 10) {
			System.out.println("O número está entre 0 a 10 ");
			if (a % 2 == 0) {
				System.out.println(a + " | O número é par");
			}
		}
		sc.close();
	}
}
