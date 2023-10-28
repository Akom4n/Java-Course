package controle;

public class For1 {

	public static void main(String[] args) {

//		int cont = 0;
//		while (cont <= 20) {
//			System.out.printf("i = %d\n", cont);
//			cont += 2;
//		}
		
		//Forma padrão de uso
		for (int cont = 0; cont <= 20; cont += 2) {
			System.out.printf("i = %d\n", cont);
		}
		
		//Forma alternativa de iniciar um for
		int x = 2;
		for(; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		//Criando um laço infinito com for
//		for (;true;) {
//			System.out.println("Fim!");
//		}
	}
}
