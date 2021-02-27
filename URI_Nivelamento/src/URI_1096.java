import java.io.IOException;
 
public class URI_1096 {
 
    public static void main(String[] args) throws IOException {
        int cont = 0;
        int J = 7;
        
        for (int i = 1; i <= 9;) {
        	
            System.out.println("I=" + i + " J=" + J);
            
            J = J - 1;
            cont = cont + 1;
            
            	if (cont == 3) {
            		i = i + 2;
            		cont = 0;
            		J= 7;
            }
        }
    }
}