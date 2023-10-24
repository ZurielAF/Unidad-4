
package practica1u4;

import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class Practica1U4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double[] numeros = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        int opcion;
        
        do{
            System.out.println("********************");
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicar");
            System.out.println("3. Salir");
            System.out.println("Elige una opcion");
            opcion = scanner.nextInt();
            
            if (opcion ==1) {
                double suma = 0;
                for (double num : numeros) {
                    suma += num;
                }
                System.out.println("La suma de los dos numeros es: " + suma);                
            } else if (opcion ==2){
                double producto = 1;
                for (double num : numeros) {
                    producto *= num;
                }
                System.out.println("El resultado de la mulriplicacion de los numeros es: " + producto);
            }
            } while (opcion != 3);
        scanner.close();
        }
    }
    
    

