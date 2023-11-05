package controle.desafios;

import java.util.Scanner;

public class NonoDesafio {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mVal = 0;
		int cont = 0;
		
		do {
			
			System.out.println("\nInsira um número: ");
			int val = sc.nextInt();
			
			if (val > mVal) {
				mVal = val;
			}
			
			cont++;
		} while(cont != 10);
		
		System.out.printf("O maior valor foi: " + mVal);
		
		sc.close();
	}

}
