import java.util.Scanner;

public class SenhaAcesso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String senhaCorreta = "Java21";
        String senha;
        

        do {
            System.out.println("Digite a senha:");
            senha = scanner.nextLine();
            
            if (!senha.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        } while (!senha.equals(senhaCorreta));
        

        System.out.println("Acesso permitido");
        
        scanner.close();
    }
}