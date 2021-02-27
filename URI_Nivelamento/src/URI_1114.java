import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class URI_1114 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner prompt = new Scanner(System.in);
   
    int senha = prompt.nextInt();

    while (senha != 2002) {
      System.out.println("Senha Invalida");
      senha = prompt.nextInt();
    }
    System.out.println("Acesso Permitido");

    }
 
}