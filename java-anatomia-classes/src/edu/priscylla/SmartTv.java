package edu.priscylla;

public class SmartTv {
    boolean ligada = false;
    int canal = 0;
    int volume = 3;

    public void ligar (){
        ligada = true;
    } 

    public void desligar (){
        ligada = false;
    }

    public void aumentarVolume (){
        volume++;
    }

    public void diminuirVolume (){
        volume--;
    }

    public void aumentarCanal (){
        canal++;
    }

    public void diminuirCanal (){
        canal--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

}
