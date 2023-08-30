package exercicios_estruturas_condicionais;

public class Genero {
    public static void main(String[] args) {
        
        String letra = "F";

        // saber se a letra digitada é F ou M

        if(letra == "F")
            System.out.println("F - Feminino");
        
        else if(letra == "M")
            System.out.println("M - Masculino");
        
        else
            System.out.println("Sexo inválido");
    }
}
