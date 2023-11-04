package controle.desafios;

import java.util.Locale;
import java.util.Scanner;

public class QuartoDesafio {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				cont++;
			}
		}
		
		if (cont == 0) {
			System.out.println("\nO número " + num + " é primo");
		}
		else {
			System.out.println("\nO número " + num + " não é primo");
		}
		
		sc.close();
	}
}	
		
	
