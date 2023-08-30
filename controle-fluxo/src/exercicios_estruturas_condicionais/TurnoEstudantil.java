package exercicios_estruturas_condicionais;
import java.util.Scanner;


//Faça um programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-vespertino ou N-noturno. Imprima a mensagem “Bom dia!” ou  “Boa Noite” ou “Valor inválido”, conforme o caso. 
/* 1. perguntar em qual turno estuda. Se matutino digitar M, verpertino V ou noturno N
 * 2. se digitar M
 *      - escrever "Bom dia"
 *    se digitar V
 *      - escrever "Boa tarde"
 *    se digitar N
 *      - escrever "Boa noite"
 *    se digitar qualquer outra letra
 *     - escrever "valor inválido"
 */
public class TurnoEstudantil {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        String turno;

        System.out.println("Olá! Em qual turno você estuda? M - Matutino | V - Vespertino | N - Noturno");
        turno = ler.nextLine();

        if(turno.equals("M"))
            System.out.println("Bom dia");
        else if(turno.equals("V"))
            System.out.println("Boa tarde");
        else if(turno.equals("N"))
            System.out.println("Boa noite");
        else
            System.out.println("Valor inválido");
    }
}
