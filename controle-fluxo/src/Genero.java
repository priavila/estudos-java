import java.util.Scanner;

public class Genero {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // saber se a letra digitada é F ou M
        System.out.println("Digite o seu sexo: ");
        String letra = scanner.nextLine();

        if(letra == "F")
            System.out.println("F = Feminino");
        
        else if(letra == "M")
            System.out.println("M = Masculino");
        
        else
            System.out.println("Sexo inválido");

        // está dando erro, não tá comparando as letras digitadas    
    }
}
