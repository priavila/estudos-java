import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if(numero < 0)
            System.out.println("Valor Negativo");
        else
            System.out.println("Valor Positivo");

    }
}
