package controle.desafios;

import java.util.Locale;
import java.util.Scanner;

public class TerceiroDesafio {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a, b, c;
		
		System.out.println("Informe a primeira nota: ");
		a = sc.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		b = sc.nextDouble();
		
		System.out.println("Informe a terceira nota: ");
		c = sc.nextDouble();
		
		double media = a + b + c / 3;
		
		if (media >= 7.0) {
			System.out.println("Aprovado!");
		}
		else if (media < 7.0 && media >= 4.0) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado");
		}
		System.out.printf("Media total: %.2f", media);
		
		sc.close();
	}
}
