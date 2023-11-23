package classe.desafios;

public class ObterData {
	
	public int dia;
	public int mes;
	public int ano;
	
	//Forma com mais flexibilidade e recomendada para uso.
	public String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	//Esse tipo de metodo não ira retornar da mesma forma que uma string, acaba tendo muito mais limitações e se restringe ao terminal.
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}

}
