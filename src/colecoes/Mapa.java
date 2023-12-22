package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(1, "Roberto"); // No Map o put é usado para adicionar e alterar, nesse caso está sendo usado para adicionar já que o valor não havia se definido
		usuarios.put(20, "Ricardo"); //Nessa caso ele altera o que ja tinha
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(4)); 
		System.out.println(usuarios.remove(1)); // Remove o 1 valor
		System.out.println(usuarios.remove(4, "Gui")); // Dará erro pois o segundo valor não existe no objeto 4
		
		//Formas de percorrer os valores do Map
		for (int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		//Forma mais completa
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ===> ");
			System.out.println(registro.getValue());
		}
	}
}
