package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1; Incrementando
		a--; // a = a - 1; Decrementando
		
		++b; //b = b + 1;
		--b; //b = b - 1;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--); //Apos rodar o codigo que a decrementação do b ira ocorrer, acabando por ser true na execução e false na linha seguinte. 
		System.out.println(a == b);
		
		System.out.println(a);
		System.out.println(b);
	}

}
