package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = scanner.nextInt();
        int contador = 0;

        for (int i = 2; contador < numero; i++) {
                if (esPrimo(i)) {
                    System.out.println(i);
                    contador++;
            }
        }
        scanner.close();
    }

    public static boolean esPrimo(int n) {
        for(int i = 2; i < n; i++){
            if(n%i == 0) {
                return false;
            }
        }
        return true;
    }


}
