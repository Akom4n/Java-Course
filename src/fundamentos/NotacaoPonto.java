package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {

		String s = "Bom dia X"; //String não é uma palavra reservada no java.
		s = s.replace("X", "Senhora"); //Substituindo o X por Senhora
		s = s.toUpperCase(); //Colocando tudo em uppercase
		s = s.concat("!!!"); //adicionando conteudo ao final da frase
		
		System.out.println(s);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X".replace("X", "Gui").toUpperCase().concat("!!!"); //Se pode usar a notaçãoponto em strings a vontade, pois são sequenciados em cadeia do metodo.
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int a = 3;
		System.out.println(a);
	}

}
