package classe;

public class Metodo {
 
	double preco;
	double desconto;
	
	double precoComDesconto() {
		return preco  * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco  * (1 - desconto + descontoDoGerente);
	}
}
