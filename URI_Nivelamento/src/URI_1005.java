import java.io.IOException;
import java.util.Scanner;

public class URI_1005 {
 
    public static void main(String[] args) throws IOException {
 
    Scanner ler = new Scanner(System.in);
    
    double A = ler.nextDouble();
    double B = ler.nextDouble();
    
    double MEDIA = ((A*3.5) + (B*7.5))/11.0;
    
    System.out.printf("MEDIA = %.5f\n", MEDIA);
    }
 
}