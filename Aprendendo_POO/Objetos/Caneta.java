package Objetos;

public class Caneta {
    public String Modelo;
    public String Cor;
    private double Ponta;
    protected int Carga;
    protected boolean Tampada;

    public void status() {
        System.out.println("Modelo : " + this.Modelo);
        System.out.print("Uma caneta " + this.Cor);
        System.out.println("Ponta : " + this.Ponta);
        System.out.println("Carga : " + this.Carga);
        System.out.println("Está tampada? " + this.Tampada);
    }

    public void rabiscar() {
        if (this.Tampada == true) {
            System.out.println("ERRO! Não Posso Rabiscar");
        } else {
            System.out.println("Estou Rabiscando!");
        }
    }

    protected void tampar() {
        this.Tampada = true;
    }

    protected void destampar() {
        this.Tampada = false;
    }
}
