package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(100));
		
		AreaCirc a2 = new AreaCirc(5);
		//a2.pi = 5;
		System.out.println(a2.area());
		
		//AreaCirc.pi = 3.1415; //Se colocasse acima das outras teria assumido o valor de Pi.
		
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}

}
