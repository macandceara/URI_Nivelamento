import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI_1175 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
 
 Scanner leitor = new Scanner(System.in);
        int aux;
        int[] N = new int[20];
        for (int i=0; i < N.length; i++) {
            N[i] = leitor.nextInt();
        }
        for (int i=0; i < (N.length / 2); i++) {
        	aux = N[i];
        	N[i] = N[N.length - 1- i];
        	N[N.length - 1 -i] = aux;
        }
        for (int i=0; i < N.length; i++) {
            System.out.println("N["+ i +"] = " + N[i]);
        }
    }
	
}
 