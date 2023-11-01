package controle;

import java.util.Locale;
import java.util.Scanner;

public class SwitchComBreak {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String conceito = "";
		System.out.print("Informe a nota: ");
		int nota = sc.nextInt();
		
		switch(nota) {
		case 10: case 9: 
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1: case 0:
			conceito = "E";
			break;
		default: //Não necessita estar na ultima posição, porem como está não precisar do break
			conceito = "não encontrado!";
		}
		
		System.out.println("Conceito é " + conceito);
		sc.close();
	}
}
