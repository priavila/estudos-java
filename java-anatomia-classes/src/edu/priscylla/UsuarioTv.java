package edu.priscylla;

public class UsuarioTv {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal padrão: " + smartTv.canal);
        System.out.println("Volume padrão: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("TV ligada: " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Diminuiu o volume para: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        
        System.out.println("Canal mudado para o: " + smartTv.canal);

        smartTv.mudarCanal(11);

        System.out.println("Canal mudado para o: " + smartTv.canal);

        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();

        System.out.println("Canal mudado para o: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Aumentou o volume para: " + smartTv.volume);



    }
}
