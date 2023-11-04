package controle.desafios;

import java.util.Scanner;

public class SetimoDesafio {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		@SuppressWarnings("unused")
		int sum = 0;
		
		while (num >= 0) {
			System.out.println("Digite um número inteiro (ou um negativo para sair): ");
			num = sc.nextInt();
			if (num >= 0) {
				sum += num;
				System.out.printf("\nSoma até o momento: %d\n", num);
			}
		}
		sc.close();
	}
}
