/*
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú:
 * El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.
 * El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5,
 * en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
 * ¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa,
 * caso contrario se vuelve a mostrar el menú.
 */
package ejercicio06;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("Ingrese el Primer Numero");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el Segundo Numero");
        int num2 = sc.nextInt();
        do {
            System.out.println("MENÚ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    int suma = num1 + num2;
                    System.out.println(suma);
                }
                case 2 -> {
                    int resta = num1 - num2;
                    System.out.println(resta);
                }
                case 3 -> {
                    int multiplicacion = num1 * num2;
                    System.out.println(multiplicacion);
                }
                case 4 -> {
                    int division = num1 / num2;
                    System.out.println(division);
                }
            }
        } while (opcion != 5);
        System.out.println("Ha salido exitosamente del programa");
    }
}
