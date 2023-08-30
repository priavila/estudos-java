package exercicios_estruturas_condicionais;
/*Faça um programa para a leitura de duas notas parciais de um aluno.  

A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
A mensagem “Aprovado com Distinção”, se a média for igual a dez;
A mensagem “Reprovado” se a média for menor de do que sete;
*/

import java.util.Scanner;

public class NotaEscolar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
            int notaUm = scanner.nextInt();
        
        System.out.println("Digite a segunda nota: ");
            int notaDois = scanner.nextInt();
        
        int mediaFinal = (notaUm + notaDois) / 2;

        if(mediaFinal >= 7 && mediaFinal < 10)
            System.out.println("Aprovado");

        else if(mediaFinal == 10)
            System.out.println("Aprovado com Distinção");

        else
            System.out.println("Reprovado");
    }
}
