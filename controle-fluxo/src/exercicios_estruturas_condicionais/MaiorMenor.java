package exercicios_estruturas_condicionais;

//Faça um programa que leia três números, verifique (usando if e else), e mostre o maior deles.  

public class MaiorMenor {
    public static void main(String[] args) {
        
        int numero1 = 1;
        int numero2 = 1;
        int numero3 = 2;

        if(numero1 > numero2)
            System.out.println("Maior é: " + numero1);
        else if(numero2 > numero3)
            System.out.println("Maior é: " + numero2);
        else
            System.out.println("Maior é: " + numero3);
    }
}
