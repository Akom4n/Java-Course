package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a,b,c;
		
		System.out.println("Informe o primeiro salário: ");
		a = sc.next().replace(",", ".");
		
		System.out.println("\nInforme o segundo salário:");
		b = sc.next().replace(",", ".");
		
		System.out.println("\nInforme o terceiro salário: ");
		c = sc.next().replace(",", "."); 

		Double resultados1 = Double.parseDouble(a);
		Double resultados2 = Double.parseDouble(b);
		Double resultados3 = Double.parseDouble(c);
		
		Double resultado = (resultados1 + resultados2 + resultados3) / 3;
		
		System.out.printf("A média dos salários é: %.2f", resultado);
		
		sc.close();
	}

}
