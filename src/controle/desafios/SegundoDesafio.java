package controle.desafios;

import java.util.Calendar;

public class SegundoDesafio {
	
	public static void main(String[] args) {
		int ano = 2000;
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, ano);
		
		
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365);
	}
}
