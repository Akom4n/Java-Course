package fundamentos;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		NumberFormat.getCurrencyInstance();
		Scanner sc = new Scanner(System.in);
		
		String a,b,c;
		
		a = sc.nextLine();
		b = sc.nextLine();
		c = sc.nextLine(); 

		Double resultados1 = Double.parseDouble(a);
		Double resultados2 = Double.parseDouble(b);
		Double resultados3 = Double.parseDouble(c);
		
		Double resultado = resultados1 + resultados2 + resultados3;
		
		System.out.printf("Salario: %.2f", resultado);
		
		sc.close();
	}

}
