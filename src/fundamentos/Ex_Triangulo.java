package fundamentos;

import java.util.Scanner;

public class Ex_Triangulo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b;
		System.out.println("Digite o valor da base do triângulo: ");
		b = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		a = sc.nextDouble();
		
		double area = (a * b) / 2;
		
		System.out.printf("Este é o valor da Área do triângulo: %.2f", area);
		
		sc.close();
	}
}
