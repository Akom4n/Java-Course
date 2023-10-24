package fundamentos;

import java.util.Scanner;

public class Ex_ResultQandC {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Double a;
		System.out.println("Digite um valor: ");
		a = sc.nextDouble();
		
		double q = Math.pow(a, 2);
		double c = Math.pow(a, 3);
		
		System.out.printf("O valor ao Quadrado é: %.2f %nO valor ao Cubo é: %.2f", q, c);
		
		sc.close();
	}

}
