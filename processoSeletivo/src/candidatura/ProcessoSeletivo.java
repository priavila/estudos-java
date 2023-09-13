package candidatura;
import java.util.Locale;
import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in).useLocale(Locale.US);
       
       analisarCandidado(input.nextDouble()); 
       
       input.close();
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
