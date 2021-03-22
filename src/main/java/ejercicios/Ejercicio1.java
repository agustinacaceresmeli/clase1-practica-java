package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero:");

        int numero = scanner.nextInt();
        int contador = 0;

        for (int i=1; contador < numero; i++){
            if(i%2 == 0){
                System.out.println(i + " es par");
                contador++;
            }
        }
        scanner.close();
    }

}
