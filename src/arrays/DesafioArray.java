package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas notas: ");
		int quantN = sc.nextInt();
		
		double[] notaA = new double[quantN];
		
		for(int i = 0; i < notaA.length; i++) {
			System.out.println("Informe a nota " + (i + 1) + ": ");
			notaA[i] = sc.nextDouble();
		}
		
		double total = 0;
		for(double nota: notaA) {
			total += nota;
		}
		
		double media = total / notaA.length;
		System.out.println("Média: " + media + "!");
		
		sc.close();
	}

}
