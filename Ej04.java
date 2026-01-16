import java.util.Scanner;

public class Ej04 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int[] array;
        int longitud = 0;

        System.out.print("Introduzca la longitud del array: ");
        longitud = teclado.nextInt();

        array = new int[longitud];

        for ( int i = 0; i < array.length; i++ ) {
            array[i] = (int)(Math.random()*50)+1;
        }

        System.out.println(convierteArrayEnString(array));

        teclado.close();
    }
    
    public static String convierteArrayEnString(int[] a) {
        String arrayCadena = "";

        for ( int i = 0; i < a.length; i++ ) {
            arrayCadena+=a[i];
        }

        return arrayCadena;
    }

}
