package fundamentos;

import java.util.Scanner;

public class Ex_FahrenheitXCelsius {
	
	public static void main(String[] args) {
		
		Double f, c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Fahrenheit: ");
		f = sc.nextDouble();
		c = (f-32)*5/9;
		System.out.printf("Temperatura em Celsius é: %.2f", c);
		sc.close();
	}
}
