package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.println("Informe a nota: ");
			nota = sc.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				a++;
			} else if(nota != -1) {
				System.out.println("Nota inválida!");
			}
		}

		// Calcular a media

		double media = total / a;
		System.out.printf("Média = %.2f", media);

		sc.close();
	}

}
