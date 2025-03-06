import java.util.Scanner;

public class ExercicioDadosUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int idade, tempoIdade;
        double altura, alturaCalculada;

        System.out.println("Qual o seu nome?");
        nome = entrada.nextLine();

        System.out.println("Qual a sua idade?");
        idade = entrada.nextInt();
        entrada.nextLine(); 

        System.out.println("Qual a sua altura");
        altura = entrada.nextDouble();


        System.out.print("Olá, " + nome + "! ");


        tempoIdade = 50 - idade;
        System.out.println("Em " + tempoIdade + " anos você terá 50 anos.");

   
        alturaCalculada = altura * 100;
        System.out.println("Sua altura em cm é: " + alturaCalculada + " cm");

         entrada.close(); 
    }
}