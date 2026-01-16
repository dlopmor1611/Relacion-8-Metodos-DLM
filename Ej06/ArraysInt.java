package Ej06;

public class ArraysInt {
    /* Genera un array de tamaño n con números aleatorios entre min y max */
    public static int[] generaArrayInt(int n, int min, int max) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int)(Math.random() * (max - min + 1)) + min;
        }
        return a;
    }

    /* Devuelve el mínimo del array */
    public static int minimoArrayInt(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            min = Math.min(min, a[i]);
        }
        return min;
    }

    /* Devuelve el máximo del array */
    public static int maximoArrayInt(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    /* Devuelve la media del array */
    public static double mediaArrayInt(int[] a) {
        int suma = 0;
        for (int num : a) {
            suma += num;
        }
        return (double) suma / a.length;
    }

    /* Dice si un número está dentro del array */
    public static boolean estaEnArrayInt(int[] a, int num) {
        for (int n : a) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }

    /* Devuelve la posición (índice) de un número en el array, o -1 si no está */
    public static int posicionEnArray(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                return i;
            }
        }
        return -1;
    }

    /* Devuelve un array invertido */
    public static int[] volteaArrayInt(int[] a) {
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[a.length - 1 - i];
        }
        return resultado;
    }

    /* Rota n posiciones a la derecha */
    public static int[] rotaDerechaArrayInt(int[] a, int n) {
        int[] resultado = new int[a.length];
        n = n % a.length;

        for (int i = 0; i < a.length; i++) {
            resultado[(i + n) % a.length] = a[i];
        }
        return resultado;
    }

    /* Rota n posiciones a la izquierda */
    public static int[] rotaIzquierdaArrayInt(int[] a, int n) {
        int[] resultado = new int[a.length];
        n = n % a.length;

        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[(i + n) % a.length];
        }
        return resultado;
    }

    /* Muestra el contenido de un array por pantalla */
    public static void mostrarArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();
    }
}