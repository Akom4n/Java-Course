package classe;

public class ConstrutorTeste {
	
	public static void main(String[] args) {
		
		//Construturo novo
		Construtor c1 = new Construtor("Notebook", 4356.89, 0.25);
		//c1.nome = "Notebook";
		
		//Construtor default
		Construtor c2 = new Construtor();
		
		
		System.out.println(c1.nome);
		//System.out.println(c2.nome);
		
		double precoFinal1 = c1.preco * (1 - c1.desconto);
		double precoFinal2 = c2.preco * (1 - c2.desconto);
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Media do carrinho: R$%.2f", mediaCarrinho);
	}

}
