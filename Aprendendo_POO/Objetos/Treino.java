package Objetos;

public class Treino {
    String Local;
    double Tempo;
    String Membro;
    int Peso;
    int BatimentoC;
    boolean Treino;

    void Intensidade() {
        if (this.Tempo > 1.3 && this.Peso > 50 && this.BatimentoC > 120 && Treino == true) {
            System.out.println("Tá Treinando Pesado hein MONSTRO!");
        } else {
            System.out.println("Aumenta essa carga e corrige essa execução seu FRANGO!");
        }
    }

    void Treinando() {
        this.Treino = true;
    }

    void status() {
        System.out.println("Local: " + this.Local);
        System.out.println("Tempo: " + this.Tempo + "h");
        System.out.println("Membro: " + this.Membro);
        System.out.println("Peso: " + this.Peso + "Kg");
        System.out.println("Batimento Cardíaco: " + this.BatimentoC);
        System.out.println("Está Treinando? " + this.Treino);
    }
}
