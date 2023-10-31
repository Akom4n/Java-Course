package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		
		//Usando apenas Strings, sem usar nada numerico
		
		for (String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
