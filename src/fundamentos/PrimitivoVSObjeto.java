package fundamentos;

public class PrimitivoVSObjeto {
	
	public static void main(String[] args) {
		
		//Tudo em java é objeto menos os tipos primitivos.
		String s = new String ("texto");
		s.toUpperCase(); 
		
		// Wrappers são a versão objeto dos tipos primitivos!
		int a = 123; //Tipo primitivo não tem nenhuma conotação ponto, pois dentro dele só tem associado um valor.
		System.out.println(a);
		
	}

}
