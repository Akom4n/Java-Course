package classe.desafios;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
//		d1.dia = 17;
//		d1.mes = 11;
		d1.ano = 2023;
		
//		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		
		var d2 = new Data(31, 12, 2020);
//		d2.dia = 31;
//		d2.mes = 12;
//		d2.ano = 2023;
		
//		System.out.printf("%d/%d/%d", d2.dia, d2.mes, d2.ano);
		
		String dataFormatada1 = d1.obterDataFormatada();
		System.out.println(dataFormatada1);	
		
		String dataFormatada2 = d2.obterDataFormatada();
		System.out.println(dataFormatada2);
	}
}
