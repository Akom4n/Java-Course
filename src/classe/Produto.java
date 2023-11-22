package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25; //Sempre entre 0 e 1 (EX: 0.1 = 10% de desconto)
	
	//Modificando para desafio Membros de classe vs Instancia
	
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto * descontoDoGerente);
	}
}
