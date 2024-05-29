package Encapsulamento;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controle1 = new ControleRemoto();

        controle1.Ligar();
        controle1.Play();
        controle1.menosVolume();
        controle1.abrirMenu();
    }
}
