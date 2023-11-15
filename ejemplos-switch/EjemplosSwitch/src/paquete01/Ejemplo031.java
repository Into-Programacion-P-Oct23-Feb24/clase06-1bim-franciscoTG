/*
ANA DIAZ con edad 19, es estudiante de UTPL

luis vera con edad 19, es estudiante de UNL
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el nombre del estudiante");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido del estudiante");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese el nombre de la universidad");
        String universidad = entrada.nextLine();
        System.out.println("Ingrese la edad del estudiante");
        int edad = entrada.nextInt();

        // nombre = "atacames"
        char valor = nombre.charAt(0); // obtener el primer caracter de una
        // cadena
        //  L   o   j   a
        //  0   1   2   3
        switch (valor) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.printf("%s %s con edad %s, es estudiante de %s\n",
                        nombre.toUpperCase(), apellido.toUpperCase(), edad, universidad);
                break;

            default:
                System.out.printf("%s %s con edad %s, es estudiante de %s\n",
                        nombre.toLowerCase(), apellido.toUpperCase(), edad, universidad);
                break;

        }

    }
}

