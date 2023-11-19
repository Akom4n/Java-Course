package classe.desafios;

public class ObterDataTeste {
	
	public static void main(String[] args) {
		ObterData d1 = new ObterData();
		d1.dia = 19;
		d1.mes = 11;
		d1.ano = 2023;
		
		ObterData d2 = new ObterData();
		d2.dia = 20;
		d2.mes = 11;
		d2.ano = 2023;
		
		String dataFormatada1 = d1.obterDataFormatada();
		System.out.println(dataFormatada1);	
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}
