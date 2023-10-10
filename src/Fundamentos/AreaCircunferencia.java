package Fundamentos;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class AreaCircunferencia {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        double raio = 3.4;
        final double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Área = " + area + "m2.");
    }
}
