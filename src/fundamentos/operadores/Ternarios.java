package fundamentos.operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial; // SImbolo de interrogação que separa as duas e o os dois pontos que separa sendo true or false
		
		System.out.println("O aluno está " + resultadoFinal);
		
		double nota = 9.0;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Não";
		
		System.out.printf("Tem desconto? %s", resultado);
	}
}
