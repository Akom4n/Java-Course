package fundamentos;

import java.util.Scanner;

public class Ex_Bhaskara {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor de A: ");
		a = sc.nextInt();
		
		System.out.println("\nDigite o valor de B");
		b = sc.nextInt();
		
		System.out.println("\nDigite o valor de C");
		c = sc.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.printf("\nResultado da equação é: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO numero do delta é: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		System.out.printf("O x1 da equação é: %.2f", x1);
		
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		System.out.printf("\nO x2 da equação é: %.2f" ,x2);
		
		sc.close();
	}

}
