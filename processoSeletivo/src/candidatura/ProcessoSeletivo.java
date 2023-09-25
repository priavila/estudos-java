package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }

    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while (continuarTentando && tentativasRealizadas < 3);

        if(atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
    }

        //método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    static void imprimirSelecionados () {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de nº" + (indice+1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }
    static void selecaoCandidatos () {
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s solicitou este valor de salário %.2f%n", candidato, salarioPretendido);
            if(salarioBase >= salarioPretendido) {
                System.out.printf("O candidato %s foi selecionado para a vaga%n", candidato);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);

    }
    static void analisarCandidado(double salarioPretendido){
        double baseSalarial = 2000.0;
        if(baseSalarial>salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        }else if(baseSalarial==salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        }else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }

    }
}
