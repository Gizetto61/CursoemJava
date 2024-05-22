package Objetos;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.Modelo = "Bic Cristal";
        caneta1.Cor = "Azul";
        // ERRO! Visibilidade privada caneta1.Ponta = 0.5;
        caneta1.Carga = 80;
        // ERRO! Visibilidade privada | caneta1.Tampada = true;
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();

        caneta1.Cor = "Azul";
        // ERRO! Visibilidade privada | caneta1.Ponta = 0.5f;
        caneta1.destampar();

        caneta1.rabiscar();

        Caneta caneta2 = new Caneta();
        caneta2.Modelo = "BIC";
        caneta2.Cor = "Vermelha";
        // ERRO! Visibilidade privada | caneta2.Ponta = 0.7;
        caneta2.status();
        caneta2.destampar();
        caneta2.rabiscar();

        Treino treino1 = new Treino();
        treino1.Local = "Academia";
        treino1.Tempo = 2.0;
        treino1.Membro = "Peito e Tríceps";
        treino1.Peso = 55;
        treino1.BatimentoC = 130;
        // ERRO! Visibilidade privada | treino1.Treino = false;
        treino1.Treinando();
        treino1.status();
        treino1.Intensidade();

    }
}
