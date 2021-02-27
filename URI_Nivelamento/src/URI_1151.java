import java.io.IOException;
import java.util.Scanner;
 

public class URI_1151 {
    
    public static long fibonacci(int n) {
        return n < 2 ? n : fibonacci(n - 2) + fibonacci(n - 1);
    }
 
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for (int i = 0; i < n; i++) {
           if (i != n-1) {
              System.out.print(fibonacci(i) + " ");
           } else System.out.print(fibonacci(i) + "\n");
        }
    }
 
}