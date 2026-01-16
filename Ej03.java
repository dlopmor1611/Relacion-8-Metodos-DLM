import java.util.Scanner;

public class Ej03 {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        char caracter = ' ';
        String cadenaAux = "";
        int altura = 0;

        System.out.print("Introduzca un solo carácter para crear una figura de este: ");
        do {
            cadenaAux = teclado.next();

            if ( cadenaAux.length() == 1 ) {
                caracter = cadenaAux.charAt(0);
            } else {
                System.out.println("ERROR - Eso no es un carácter");
            }
        } while ( cadenaAux.length() != 1 );

        System.out.print("Introduzca un número entre el 1 y el 20 para la altura de la figura: ");
        do {
            altura = teclado.nextInt();

            if ( !(altura > 1 && altura < 20) ) {
                System.out.println("ERROR - Tamaño de la figura fuera de rango");
            }
        } while ( !(altura > 1 && altura < 20) );

        crearFigura(caracter, altura);

        teclado.close();
    }

    public static void crearFigura (char c, int a) {

       for ( int i = a; i > 0; i-- ) {
            for ( int j = 0; j < i; j++ ) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}