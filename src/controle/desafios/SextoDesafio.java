package controle.desafios;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class SextoDesafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cont, numCerto, tentativas, num;

		do {
			System.out.println("Sorteando número entre 0 a 100..\n");
			Random numAleatorio = new Random();
			numCerto = numAleatorio.nextInt(101);

			System.out.println("Start Game!");
			tentativas = 0;
			do {
				tentativas++;
				System.out.printf("Tentativa %d\n", tentativas);
				num = sc.nextInt();

				if (num > numCerto) {
					System.out.printf("\nO numero sorteado e menor que %d\n\n", num);
				} else if (num < numCerto) {

					System.out.printf("\nO numero sorteado e maior que %d\n\n", num);

				} else {

					System.out.printf("\nParabens! Voce acertou o numero em %d tentativas!\n\n", tentativas);
					break;
				}

			} while (tentativas != 10);

			System.out.println("Digite 0 para sair, ou qualquer outro número para continuar: ");
			cont = sc.nextInt();

		} while (cont != 0);

		sc.close();
	}
}
