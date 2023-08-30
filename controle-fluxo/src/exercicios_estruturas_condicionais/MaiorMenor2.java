package exercicios_estruturas_condicionais;

//Faça um programa que leia três números, verifique (usando if e else) e mostre o maior e o menor deles;  
public class MaiorMenor2 {
    public static void main(String[] args) {
        
        int numero1 = 0;
        int numero2 = 7;
        int numero3 = 2;

       if(numero1 > numero2)
            System.out.println("O maior é: " + numero1);
       else if(numero2 > numero3)
            System.out.println("O maior é: " + numero2);
       else 
            System.out.println("O maior é: " + numero3);
        
       if(numero1 < numero2)
            System.out.println("O menor é: " + numero1);
       else if(numero2 < numero3)
            System.out.println("O menor é " + numero2);
       else 
            System.out.println("O menor é: " + numero3);
    

    }
}
