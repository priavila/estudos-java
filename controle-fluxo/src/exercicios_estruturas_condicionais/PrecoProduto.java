package exercicios_estruturas_condicionais;
import java.util.Scanner;
import java.util.Locale;

//Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a decisão é sempre o mais barato.  
/* possibilidades: 
 *      preco1 < preco2 e preco1 < preco3 
 *      preco2 < preco1 e preco2 < preco3
 *      preco3 < preco2 e preco3 < preco1
 */

public class PrecoProduto {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o preço do produto 1? ");
            double preco1 = scanner.nextDouble();
        
        System.out.println("Qual o preço do produto 2? ");
            double preco2 = scanner.nextDouble();

        System.out.println("Qual o preço do produto 3? ");
            double preco3 = scanner.nextDouble();

        if(preco1 < preco2 && preco1 < preco3)
            System.out.println("Você deve comprar o Produto 1");

        else if(preco2 < preco1 && preco2 < preco3)
            System.out.println("Você deve comprar o Produto 2");

        else
            System.out.println("Você deve comprar o Produto 3");
    }
}
