import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite mais um numero: ");
        int numeroDois = scanner.nextInt();

        if(numeroUm > numeroDois)
            System.out.println("O valor maior é: " + numeroUm);
        else
            System.out.println("O valor maior é: " + numeroDois);
    
    }
}
