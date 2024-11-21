
/**
// EXERICI 1 STRINGS

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cadena = input.nextLine();

        System.out.println(cadena.length());
        // No contar espacios con replace.(" ", "") // old_char, new_char


    }
}

// Exercici 2: (Hay que revisarlo, la solucion la tienes en el gmail)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Demanar la cadena
        System.out.print("Introdueix una cadena: ");
        String cadena = input.nextLine();

        // Array per emmagatzemar la freqüència (256 per als caràcters ASCII)
        int[] frequencia = new int[256];

        // Comptar freqüència de cada caràcter
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            frequencia[caracter]++;
        }

        // Mostrar el resultat
        for (int i = 0; i < frequencia.length; i++) {
            if (frequencia[i] > 0) {
                System.out.println((char) i + ": " + frequencia[i]);
            }
        }
    }
}


// Exercici 3:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Demanar la cadena
        System.out.print("Introdueix una cadena: ");
        String cadena = input.nextLine();

        // Comprovar la longitud de la cadena
        String resultat;
        if (cadena.length() < 2) {
            resultat = ""; // Retorna una cadena buida si la longitud és menor a 2
        } else {
            // Primer 2 i darrers 2 caràcters
            resultat = cadena.substring(0, 2) + cadena.substring(cadena.length() - 2);
        }

        // Mostrar el resultat
        System.out.println("Resultat: " + resultat);
    }
}
**/

// Exercici 4:

import java.util.Scanner;
public class Main {
    public static void main(String[] args){

    }
}