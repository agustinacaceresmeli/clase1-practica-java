package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cantidad de numeros: ");
        int cantNumeros = scanner.nextInt();

        System.out.println("Ingrese cantidad de digitos:");
        int cantDigitos = scanner.nextInt();

        System.out.println("Ingrese el numero que debe estar presente:");
        int digito = scanner.nextInt();

        int contador = 0;
        int aux = 0;

        for (int i = 0; aux != cantNumeros; i++) {
            contador = cuentaNumerosRepetidos(i, digito);
            if (cantDigitos <= contador) {
                System.out.println(i);
                aux++;
            }
        }
    }

    public static int cuentaNumerosRepetidos(int i, int d) {
        int contador = 0;
        while (i > 0) {
            contador = (i % 10 == d) ? contador + 1 : contador;
            i = i / 10;
        }
        return contador;
    }
}

