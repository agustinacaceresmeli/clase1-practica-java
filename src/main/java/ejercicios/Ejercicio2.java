package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int primerNumero = scanner.nextInt();

        System.out.println("Ingrese otro numero:");
        int segundoNumero = scanner.nextInt();

        for (int i = 1; i < segundoNumero; i++) {
            if (segundoNumero%i == 0) {
                System.out.println(i + " es multiplo");
            }
            scanner.close();
        }
    }
}
