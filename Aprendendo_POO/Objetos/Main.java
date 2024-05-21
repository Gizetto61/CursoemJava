package Objetos;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.Cor = "Azul";
        caneta1.Ponta = 0.5f;
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();

        Caneta caneta2 = new Caneta();
        caneta2.Modelo = "BIC";
        caneta2.Cor = "Vermelha";
        caneta2.Ponta = 0.7;
        caneta2.status();
        caneta2.destampar();
        caneta2.rabiscar();

        Treino treino1 = new Treino();
        treino1.Local = "Academia";
        treino1.Tempo = 2.0;
        treino1.Membro = "Peito e Tríceps";
        treino1.Peso = 50;
        treino1.BatimentoC = 130;
        treino1.Treinando();
        treino1.status();
        treino1.Intensidade();
    }
}
