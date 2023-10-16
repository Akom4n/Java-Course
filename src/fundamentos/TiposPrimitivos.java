package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		/* Sobre tipos primitivos

	     Tipos inteiros numericos: byte(1), short(2), int(4), long(8) (A diferença primordial entre eles seria a capacidade numerica de cada).
	     
	     Tipos inteiros com pontos flutuantes: float, double (O double é o dobro do float(F4 - D8)
	     
	     Tipo char: representa um caractere, seja uma letra até um simbolo desde que seja apenas um caractere.
	     
	     Tipo boolean : representa sempre false or true(0 ou 1)

	     */
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23; //Max 127, min -127
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; //use o L ou l no final para definir que este é um literal long.
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos booleano
		boolean estaDeFerias = false; //true
		
		// Tipo caractere/char
		
		char status = 'A'; //ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias?" + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
