public class SmartTv {
    boolean ligada = false;
    int canal = 5;
    int volume = 10;

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminuirCanal() {
        canal--;
    }

    public void aumentarVolume() {
        // volume = volume + 1;
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }
    
    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }
}