import java.util.Scanner;

public class Ej02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int num = 0;

        System.out.print("Introduzca un número para convertir sus valores a palabras: ");
        num = teclado.nextInt();

        System.out.println(convierteEnPalabras(num));

        teclado.close();
    }

    public static String convierteEnPalabras (int n) {
        String[] numerosTexto = {
            "cero", "uno", "dos", "tres", "cuatro", 
            "cinco", "seis", "siete", "ocho", "nueve"
        };
        String cadenaVuelta = "", cadenaNumero = "";
        int digito = 0;

        cadenaNumero = String.valueOf(n);

        for ( int i = 0; i < cadenaNumero.length(); i++ ) {
            digito = Character.getNumericValue(cadenaNumero.charAt(i));
            cadenaVuelta += numerosTexto[digito];

            if ( cadenaNumero.length()-1 != i ) {
                cadenaVuelta+=" , ";
            }
        }

        return cadenaVuelta;
    }
}