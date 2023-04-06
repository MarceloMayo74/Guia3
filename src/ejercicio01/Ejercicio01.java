/*
 * Crear un programa que dado un número determine si es par o impar.
 */
package ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Numero");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es Par");
        } else {
            System.out.println("El Numero " + num + " es Impar");
        }
    }
}
