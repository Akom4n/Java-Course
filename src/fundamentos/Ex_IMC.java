package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Ex_IMC {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double peso, altura;
		System.out.println("Informe seu peso: ");
		peso = sc.nextDouble();
		
		System.out.println("Informe sua altura: ");
		altura = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.printf("Seu IMC é: %.2f", imc);
		
		sc.close();
	}

}
