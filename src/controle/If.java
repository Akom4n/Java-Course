package controle;

import java.util.Locale;
import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = sc.nextDouble();
		
		if (media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		else if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}
}
