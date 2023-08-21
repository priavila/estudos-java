package edu.priscylla;

public class ExercicioClasses {
    public static void main(String[] args) {
        String primeiroNome = "Priscylla";
        String segundoNome = "Ávila";
        String birthday = "Janeiro";
        String idade = "trinta anos";
        String formacao = "Relações Públicas";
        String cidade = "Maceió/AL";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        String mesAniversario = mesAniversario(birthday);
        String age = age(idade);
        String faculdade = faculdade(formacao);
        String city = city(cidade);
        
        System.out.println(nomeCompleto);
        System.out.println(mesAniversario);
        System.out.println(age);
        System.out.println(faculdade);
        System.out.println(city);
        
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Meu nome é " + primeiroNome.concat(" ").concat(segundoNome);
    }

    public static String mesAniversario (String birthday) {
        return "Mês de aniversário: " + birthday.concat( " ");
    }

    public static String age (String idade) {
        return "Tenho " + idade.concat(" ");
    }

    public static String faculdade (String formacao) {
        return "Formada em " + formacao.concat(" ");
    }

    public static String city (String cidade) {
        return "Moro em " + cidade.concat(" ");
    }   

}
