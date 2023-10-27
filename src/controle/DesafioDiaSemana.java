package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o dia: ");
		double dia = sc.nextDouble();
		
		if(dia == 1) {
			System.out.println("Domingo");
		}
		else if(dia == 2) {
			System.out.println("Segunda-Feira");
		}
		else if(dia == 3) {
			System.out.println("Terça-Feira");
		}
		else if(dia == 4) {
			System.out.println("Quarta-Feira");
		}
		else if(dia == 5) {
			System.out.println("Quinta-Feira");
		}
		else if(dia == 6) {
			System.out.println("Sexta-Feira");
		}
		else if(dia == 7) {
			System.out.println("Sabado");
		}
		
		sc.close();
	}

}
