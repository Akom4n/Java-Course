package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtAlunos = sc.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtNotas = sc.nextInt();
		
		double[][] alunosNotas = new double[qtAlunos][qtNotas];
		
		double total = 0;
		for (int i = 0; i < alunosNotas.length; i++) {
			for (int j = 0; j < alunosNotas[i].length; j++) {
				System.out.printf("Informe a nota %d do aluno %d: ", j + 1, i + 1);
				alunosNotas[i][j] = sc.nextDouble();
				total += alunosNotas[i][j];
			}
		}
		
		double media = total / (qtAlunos * qtNotas);
		System.out.println("Media da turma é: " + media);
		
		for(double[] notasDoAluno: alunosNotas) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		
		sc.close();
	}

}
