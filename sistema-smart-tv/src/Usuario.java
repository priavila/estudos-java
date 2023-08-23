public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("Canal padrão: " + smartTv.canal);

        smartTv.mudarCanal(7);

        System.out.println("Canal atual: " + smartTv.canal);

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal padrão: " + smartTv.canal);
        System.out.println("Volume padrão: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.diminuirVolume ();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirCanal();
        System.out.println("Novo canal: " + smartTv.canal);
    }
}
