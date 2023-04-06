/*
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
 * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
 * en caso contrario, se deberá imprimir “INCORRECTO”.
 */
package ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        do {
            System.out.println("Ingrese una Palabra de 8 Caracteres");
            frase = sc.next();
            if (frase.length() != 8) {
                System.out.println("Incorrecto");
            } else {
                System.out.println("Correcto");
            }
        } while (frase.length() != 8);
    }
}
