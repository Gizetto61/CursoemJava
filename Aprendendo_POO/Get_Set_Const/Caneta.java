package Get_Set_Const;

public class Caneta {
    private String Modelo;
    private double Ponta;
    private String Cor;
    private Boolean Tampada;

    /*
     * Construtor SIMPLES
     * public Caneta() {
     * this.Tampar();
     * this.Cor = "Azul";
     * }
     */

    public Caneta(String modelo, double ponta, String cor, Boolean tampada) {
        this.Modelo = modelo;
        this.Ponta = ponta; // Iguáis
        this.setCor(cor); // Iguáis
        this.setTampada(tampada);
    }

    public String getModelo() {
        return this.Modelo;
    }

    public void setModelo(String modelo) {
        this.Modelo = modelo;
    }

    public double getPonta() {
        return this.Ponta;
    }

    public void setPonta(double ponta) {
        this.Ponta = ponta;
    }

    public String getCor() {
        return this.Cor;
    }

    public void setCor(String cor) {
        this.Cor = cor;
    }

    public Boolean getTampada() {
        return this.Tampada;
    }

    public void setTampada(Boolean tampada) {
        this.Tampada = tampada;
    }

    public void Status() {
        System.out.println("SOBRE A CANETA: ");
        System.out.println("MODELO: " + this.getModelo());
        System.out.println("PONTA: " + this.getPonta());
        System.out.println("COR: " + this.getCor());
        System.out.println("TAMPADA: " + this.getTampada());
    }

    public void Tampar() {
        this.Tampada = true;
    }

    public void Destampar() {
        this.Tampada = false;
    }
}
