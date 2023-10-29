package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// if (...) sentença; ou {}
		// while(...) sentença; ou {}
		// for(...;...;...;) sentença; ou {}
		
		// do sentença; ou {} while(...);
		
		Scanner sc = new Scanner(System.in);
		String a = "";
		
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.println("Quer sair? ");
			a = sc.nextLine();
		} while (!a.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado");
		sc.close();
	}
}
