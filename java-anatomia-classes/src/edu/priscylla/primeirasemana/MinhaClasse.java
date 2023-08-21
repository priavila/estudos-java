package edu.priscylla.primeirasemana;
public class MinhaClasse {
 
// Classe executável - MÉTODO MAIN //   
public static void main (String [] args) {

    String primeiroNome = "Priscylla";
    String segundoNome = "Fragoso";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

    //System.out.print ( "Olá turma, sejam bem-vindos");//

    //Variáveis 
        // tipo NomeBemDefinido = Atribuição 
    // Exemplo
        //int idade1 = 23;
        //int idade2 = 31;
}
    // DECLARAR MÉTODO 
        // TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)
    // Exemplo
        //int somar (int idade1, int idade2);

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Meu nome é " + primeiroNome.concat(" ").concat(segundoNome); 
}











  
}


