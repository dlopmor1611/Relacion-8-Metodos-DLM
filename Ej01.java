
import java.util.Scanner;

public class Ej01 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num = 0;

        System.out.print("Introduzca un número para convertirlo en palotes: ");
        num = teclado.nextInt();

        System.out.println(convierteEnPalotes(num));

        teclado.close();
    }

    public static String convierteEnPalotes (int n) {
        String cadenaPalotes = "", cadenaNumero = "";
        int digito = 0;

        cadenaNumero = String.valueOf(n);

        for ( int i = 0; i < cadenaNumero.length(); i++ ) {
            digito = Character.getNumericValue(cadenaNumero.charAt(i));
            for ( int j = 0; j < digito ; j++ ) {
                cadenaPalotes+= "|";
            }
            if ( cadenaNumero.length()-1 != i ) {
                cadenaPalotes += " - ";
            }
        }

        return cadenaPalotes;
    }
}