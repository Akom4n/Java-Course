package controle;

public class Break {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break; //Break serve para quebrar o fluxo, usar ele nos laços de repetição faz mais sentido que em um if.
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}

}
