public class Notinha {

    public static void main(String[] args) {
        int Nota = 7;

        String resultado = Nota >= 7 ? "Aprovado" : Nota <7 && Nota >=5 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}