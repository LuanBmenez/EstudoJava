import java.util.Scanner;

public class CadastroDeAtletas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cadastro
        System.out.println("Cadastro de atletas");
        
        // Nome
        System.out.println("Nome do atleta:");
        String nome = scanner.nextLine();  // Aqui lemos o nome do atleta
        
        // Idade
        System.out.println("Idade do atleta:");
        int idade = scanner.nextInt();
        
        // Consumir a quebra de linha que ficou no buffer após o nextInt()
        scanner.nextLine();  // Esta linha é necessária para ler a próxima linha corretamente
        
        // Categoria
        String categoria;
        if (idade <= 10) {
            categoria = "Infantil";
        } else if (idade <= 15) {
            categoria = "Juvenil";
        } else if (idade <= 19) {
            categoria = "Júnior";
        } else if (idade <= 40) {
            categoria = "Adulto";
        } else {
            categoria = "Master";
        }

        // Exibir
        System.out.println("Nome do atleta: " + nome);
        System.out.println("Idade do atleta: " + idade);
        System.out.println("Categoria do atleta: " + categoria);

        scanner.close();
    }
}