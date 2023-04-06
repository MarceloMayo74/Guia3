/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números
 * al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package ejercicio05;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Limite Positivo");
        int limite = sc.nextInt();
        int num;
        int suma = 0;
        do {
            System.out.println("Ingrese un numero");
            num = sc.nextInt();
            suma += num;
        } while (suma <= limite);
        System.out.println("La suma supero al limite");
    }
}
