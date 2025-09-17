
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int n1, n2, soma, sub;

        System.out.println("Digite o primeiro nmero: ");
        n1 = scanner.nextInt();

        System.out.println("Digite o segundo nmero: ");
        n2 = scanner.nextInt();

        soma = n1 + n2;
        System.out.println("A soma dos numeros " + n1 + " e " + n2 + "  = " + soma);

        sub = n1 - n2;
        System.out.println("A subtrao dos numeros " + n1 + " e " + n2 + "  = " + sub);
        
        scanner.close();

    }
}
