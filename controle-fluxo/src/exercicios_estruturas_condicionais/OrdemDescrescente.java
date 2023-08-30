package exercicios_estruturas_condicionais;
import java.util.Scanner;

//Faça um programa que leia três números e mostre-os em ordem decrescente.  
/* 1. pedir para escrever os três numeros (a, b, c) 2, 3, 4
    possibilidades:
        a b c / a c b / b a c / b c a / c b a / c a b 
 * 2. teste:
 *      a > b / a > c / b < a / b > c / c < b
 *      a > c / a > b / c < a / c > b / b < c
 *      b > a / b > c / a < b / a > c / c < a
 *      b > c / b > a / c < b / c > a / a < c
 *      c > b / c > a / b < c / b > a / a < b
 *      c > a / c > b / a < c / a > b / b < a
 */
public class OrdemDescrescente {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
            int numeroUm = scanner.nextInt();
        System.out.println("Digite outro número: ");
            int numeroDois = scanner.nextInt();
        System.out.println("Digite mais um número: ");
            int numeroTres = scanner.nextInt();
        System.out.println("Em ordem descrescente");

        //a > b / a > c / b < a / b > c / c < b
        if(numeroUm > numeroDois && numeroUm > numeroTres && numeroDois < numeroUm && numeroDois > numeroTres && numeroTres < numeroDois){
            //a b c
            System.out.println(numeroUm);
            System.out.println(numeroDois);
            System.out.println(numeroTres);

        //a > c / a > b / c < a / c > b / b < c
        }else if(numeroUm > numeroTres && numeroUm > numeroDois && numeroTres < numeroUm && numeroTres > numeroDois && numeroDois < numeroTres){
            //a c b
            System.out.println(numeroUm);
            System.out.println(numeroTres);
            System.out.println(numeroDois);

        //b > a / b > c / a < b / a > c / c < a
        }else if(numeroDois > numeroUm && numeroDois > numeroTres && numeroUm < numeroDois && numeroUm > numeroTres && numeroTres < numeroUm){
            //b a c
            System.out.println(numeroDois);
            System.out.println(numeroUm);
            System.out.println(numeroTres);

        //b > c / b > a / c < b / c > a / a < c
        }else if(numeroDois > numeroTres && numeroDois > numeroUm && numeroTres < numeroDois && numeroTres > numeroUm && numeroUm < numeroTres){
            //b c a
            System.out.println(numeroDois);
            System.out.println(numeroTres);
            System.out.println(numeroUm);
        
        //c > b / c > a / b < c / b > a / a < b
        }else if(numeroTres > numeroDois && numeroTres > numeroUm && numeroDois < numeroTres && numeroDois > numeroUm && numeroUm < numeroDois){
            //c b a 
            System.out.println(numeroTres);
            System.out.println(numeroDois);
            System.out.println(numeroUm);

        //c > a / c > b / a < c / a > b / b < a
        }else{
            //c a b 
            System.out.println(numeroTres);
            System.out.println(numeroUm);
            System.out.println(numeroDois);  
        }

    }
}
