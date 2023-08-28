public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 4;

        if(nota >= 7) // condição sempre verdadeira
            System.out.println("APROVADO");

        else if(nota >= 5 && nota < 7) // condição true or false
            System.out.println("PROVA DE RECUPERAÇÃO");
        
        else
            System.out.println("REPROVADO");

    }
}
