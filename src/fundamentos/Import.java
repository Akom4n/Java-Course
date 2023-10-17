package fundamentos;

import java.util.Date;

public class Import {
	
	public static void main(String[] args) {
		java.lang.String b = "Boa tarde!"; // Forma de puxar diretamente, porem sem necessidade pois por padrão já tem o java.lang
		System.out.println(b);
		
		String s = "Bom dia";
		System.out.println(s); // Não teve necessidade de import
		
		Date d = new Date(); // Aqui já teve a necessidade do import do java.util.Date
		System.out.println(d);
		
		// JButton botao = new JButton(); // Importando uma interface como exemplo
		
		//Control+Shift+O serve para puxar imports ou correções no codigo
	}

}
