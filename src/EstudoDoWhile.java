import java.util.Random;

public class EstudoDoWhile {
    public static void main(String[] args) {
        System.err.println("Discando...");

        do{
            System.err.println("Telefone tocando");
            
        }
        while(tocando());
        System.err.println("Alôo !!!");
    }
    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.err.println("Atendeu? " + atendeu);
   
        return ! atendeu;
    }
}
