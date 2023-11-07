
package practica2u4;

/**
 *
 * @author Zuriel
 */
public class Practica2U4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        char [][] letras = new char [3][5];
        char letra = 'a';
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                letras[i][j] = letra;
                letra++;
                
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(letras[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
