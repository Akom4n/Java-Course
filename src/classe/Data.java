package classe;

public class Data {
	
	//Por padrão sempre definir variaveis no inicio
	int dia;
	int mes;
	int ano;
	
	//Desafio aula 103
	
	//Aula sobre this e this();
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
		
		//Objetos vão ter por padrão valor -> null
		//Valores padrões de cada tipo
		//byte, short, int, long -> 0
		//float, double -> 0.0
		//boolean -> false
		//char -> '\u0000'
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; //Var local.
		return String.format(formato, this.dia, mes, ano);
	}
}
