package controle;

import java.util.Scanner;

public class While2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = "";
		
		while (!a.equalsIgnoreCase("sair")) {
			System.out.print("Você diz: ");
			a = sc.nextLine();
		}
			
		
		sc.close();
	}

}
