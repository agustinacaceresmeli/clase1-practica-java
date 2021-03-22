package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = scanner.nextInt();

        for (int i = 2; i < numero; i++) {
            if(numero%i == 0) {
                System.out.println(numero + " no es primo");
            } else {
                System.out.println(numero + " es primo");
            }
            break;
        }
        scanner.close();
    }


}
