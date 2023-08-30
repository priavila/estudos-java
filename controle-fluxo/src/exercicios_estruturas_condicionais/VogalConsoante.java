package exercicios_estruturas_condicionais;

import java.util.Scanner;

public class VogalConsoante {

    public static void main(String[] args) {
        //Fácil 4- Faça um programa que verifique (usando if e else) se uma letra digitada é vogal ou consoante.

        String letra = "E";

        if(letra == "A")
            System.out.println("Vogal");
        else if(letra == "E")
            System.out.println("Vogal");
        else if(letra == "I")
            System.out.println("Vogal");
        else if(letra == "O")
            System.out.println("Vogal");
        else if(letra == "U")
            System.out.println("Vogal");
        else
            System.out.println("Consoante");
    }
}