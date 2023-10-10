package Fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        //Você não pode mudar o tipo da var de double para string a partir do momento que um valor é definido.
        //Você também não pode declarar uma variavel sozinha em uma linha sem valor, e passar o valor na proxima linha.
        double a = 4.5;
        System.out.println(a);

        a = 12.57;
        System.out.println(a);

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        double d; //variável foi declarada
        d = 123.65; // variável foi inicializada
        System.out.println(d); // Usada!

        var e = 123.45;
        System.out.println(e);

        var f = 12; //Inteiro (No momento que voce cria um int você não pode declaarar um valor double, porem o contrario é possivel.
        System.out.println(f);
    }
}
