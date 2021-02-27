import java.io.IOException;
import java.util.Scanner;

public class URI_1153 {

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    long n = sc.nextInt();
    long fatorial = 1;
    long i = n;

    while (i >= 1) {
      fatorial = fatorial * i;
      i = i - 1;
    } 

    System.out.println(fatorial);

  }
}