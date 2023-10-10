package Fundamentos;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        // (F - 32) x 5/9 = C
        Scanner sc = new Scanner(System.in);

        final double FATOR = 5.0 / 9.0;
        final double AJUSTE = 32;
        double fahrnheit = 86;
        double celsius = (fahrnheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C.");

        fahrnheit = 150;
        celsius = (fahrnheit - AJUSTE) * FATOR;
        System.out.println("O resultado é " + celsius + "°C.");
    }
}
