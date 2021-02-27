  import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI_2760 {
 
    public static void main(String[] args) throws IOException {
 
        /**
         * Escreva a sua solução aqui
         * Code your solution here
         * Escriba su solución aquí
         */
    	 Scanner leitor = new Scanner(System.in);
    	 
    	 String A = leitor.nextLine();
    	 String B = leitor.nextLine();
    	 String C = leitor.nextLine();
    	
    		System.out.printf("%s%s%s\n", A, B, C);
    		System.out.printf("%s%s%s\n", B, C, A);
    		System.out.printf("%s%s%s\n", C, A, B);
    		System.out.printf("%.10s%.10s%.10s\n", A, B, C);
    	
    	
    }
 
}