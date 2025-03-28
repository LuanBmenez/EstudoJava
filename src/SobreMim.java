import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class SobreMim {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu Sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Digite seu idade");
            int idade = scanner.nextInt();

            System.out.println("Digite seu altura");
            Double altura = scanner.nextDouble();

            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");
            scanner.close();

        } 
        catch (InputMismatchException e) {
            System.err.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
