import java.util.Arrays;

public class Ej05 {

    public static void main(String[] args) {
        
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[array1.length + array2.length];

        for ( int i = 0; i < array1.length; i++ ) {
            
            array1[i] = (int)(Math.random()*10)+1;
            array2[i] = (int)(Math.random()*10)+1;
        }

        array3 = concatena(array1, array2);

        for ( int i = 0; i < array3.length; i++ ) {
            System.out.print(array3[i]);

            if ( array3.length-1 != i ) {
                System.out.print(" , ");
            }
        }

    }

    public static int[] concatena(int[] a, int[] b) {

        int[] ab = Arrays.copyOf(a, a.length + b.length);

        for ( int i = 0; i < b.length; i++ ) {
            ab[a.length + i] = b[i];
        }

        return ab;
    }
}