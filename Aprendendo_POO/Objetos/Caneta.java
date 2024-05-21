package Objetos;

public class Caneta {
    String Modelo;
    String Cor;
    double Ponta;
    int Carga;
    boolean Tampada;

    void status() {
        System.out.println("Modelo : " + this.Modelo);
        System.out.print("Uma caneta " + this.Cor);
        System.out.println("Ponta : " + this.Ponta);
        System.out.println("Carga : " + this.Carga);
        System.out.println("Está tampada? " + this.Tampada);
    }

    void rabiscar() {
        if (this.Tampada == true) {
            System.out.println("ERRO! Não Posso Rabiscar");
        } else {
            System.out.println("Estou Rabiscando!");
        }
    }

    void tampar() {
        this.Tampada = true;
    }

    void destampar() {
        this.Tampada = false;
    }
}
