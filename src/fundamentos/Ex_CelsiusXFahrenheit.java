package fundamentos;

import java.util.Scanner;

public class Ex_CelsiusXFahrenheit {
	
	public static void main(String[] args) {
		
		double f, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor em Celsius: ");
		c = sc.nextDouble();
		f = (c*1.8)+32;
		System.out.printf("Valor convertido para Fahrenheit: %.2f", f);
		
		sc.close();
		
		
	}

}
