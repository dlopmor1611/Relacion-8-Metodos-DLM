
import java.util.Scanner;

// Estos imports solo son necesarios si esta clase NO está en el paquete Ej06.
// Si estuviera en el mismo paquete, no haría falta importarlos porque las clases se conocen entre sí.
import Ej06.ArraysInt;
import Ej06.Menu;


public class Ej06 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int tamano = 0, minimo = 0, maximo = 0, opcion = 0, num = 0;
        int[] array;

        System.out.print("Introduzca el tamaño del Array (lo quiero entre 1-20): ");
        do {
            
            tamano = teclado.nextInt();

            if ( !(tamano >= 1 && tamano <= 20) ) {
                System.out.println("Este número está fuera de rango");
            }
            
        } while ( !(tamano >= 1 && tamano <= 20) );

        System.out.print("Introduzca el minimo del array: ");
        minimo = teclado.nextInt();

        do {

            System.out.print("Introduzca el máximo del array: ");

            maximo = teclado.nextInt();

            if ( minimo > maximo ) {
                System.out.println("ERROR - El máximo es menor que el mínimo");
            }

        } while ( minimo > maximo );

        array = ArraysInt.generaArrayInt(tamano, minimo, maximo);

        ArraysInt.mostrarArray(array);

        System.out.println("\n");
            
        do {
            
            Menu.mostrarMenu();
            System.out.print("Introduzca una opción: ");
            opcion = teclado.nextInt();

            switch ( opcion ) {
                case 1 :
                    
                    System.out.printf("El mínimo del array es %d", ArraysInt.minimoArrayInt(array));

                break;

                case 2 :

                    System.out.printf("El máximo del array es %d", ArraysInt.maximoArrayInt(array));
                    
                break;

                case 3 :
                
                    System.out.printf("La media del array es %.2f", ArraysInt.mediaArrayInt(array));

                break;

                case 4 :
                        
                    System.out.println("Escribe un número para comprobar si el número está en el array: ");
                    num = teclado.nextInt();

                    System.out.println();
                    if ( ArraysInt.estaEnArrayInt(array, num) ) {
                        System.out.printf("%d está en el array",num);
                    } else {
                        System.out.printf("%d NO está en el array",num);
                    }
                
                break;

                case 5 :
                    
                    System.out.println("Escribe un número y te diré la posición en el array: ");
                    num = teclado.nextInt();

                    System.out.println();
                    int pos = ArraysInt.posicionEnArray(array, num);

                    if (pos == -1) {
                        System.out.printf("%d NO está en el array", num);
                    } else {
                        System.out.printf("%d está en el array en la posición %d", num, pos);
                    }

                break;

                case 6 :
                    
                    int[] arrayVolteado = ArraysInt.volteaArrayInt(array);
                    System.out.print("El array volteado es: ");

                    ArraysInt.mostrarArray(arrayVolteado);

                break;

                case 7 :

                    System.out.print("¿Cuántas posiciones quieres rotar el array hacia la derecha?: ");
                    num = teclado.nextInt();

                    int[] arrayRotadoD = ArraysInt.rotaDerechaArrayInt(array, num);

                    ArraysInt.mostrarArray(arrayRotadoD);
                    
                break;

                case 8 :
                    
                    System.out.print("¿Cuántas posiciones quieres rotar el array hacia la izquierda?: ");
                    num = teclado.nextInt();

                    int[] arrayRotadoI = ArraysInt.rotaIzquierdaArrayInt(array, num);

                    ArraysInt.mostrarArray(arrayRotadoI);

                break;

                case 9 :
                    
                    System.out.println("Cerrando el programa...");

                break;
            
                default:

                     System.out.println("ERROR - Posición inválida.. (1-9)");

                break;
            }

            System.out.println("\n");

        } while ( opcion != 9 );

        teclado.close();
    }
}