package classe;

public class MetodoTeste {
	
	public static void main(String[] args) {
		
		Metodo p1 = new Metodo();
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Metodo();
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		
		double precoFinal1 = p1.precoComDesconto(0);
		double precoFinal2 = p2.precoComDesconto(0.1);
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		System.out.printf("Media do carrinho: R$%.2f", mediaCarrinho);
	}

}
