package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// + - * / %
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o número: ");
		double num1 = sc.nextDouble();
		
		System.out.println("Informe a operação: ");
		String op = sc.next();
		
		System.out.println("Informe o número: ");
		double num2 = sc.nextDouble();
		
		//Logica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %f = %.2f", num1, op, num2, resultado);
		sc.close();
	}

}
