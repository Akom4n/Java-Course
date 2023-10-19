package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; //Conversão implícita
		System.out.println(a);
		
		float b = (float) 1.123456788888; //Conversão explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; // explícita (CAST)
		System.out.println(f);
		
		//evitar Cast pois pode desencadear bastante problemas, usar mais int e double do que byte, short ou long, só em casos realmente especificos
	}

}
