import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.println("Entre com os numeros A, B, C, D: ");
        
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        diferenca = (A*B-C*D);

        System.out.print("A diferenca entre eles e: " + diferenca);

        sc.close();
    }
}
