package Estudo.Metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println("A TV está ligada? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> : A TV está ligada? "+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> : A TV está ligada? "+smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("O volume atual é: "+smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("O volume atual é: "+smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("O canal agora é :"+smartTv.canal);

        smartTv.subirCanal();
        System.out.println("O canal agora é: "+smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println("O canal agora é: "+smartTv.canal);
    }
}