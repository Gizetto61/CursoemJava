package Projeto01;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta(0, null, null, 0, null);
        c1.setnumConta(1111);
        c1.setDono("Giovanni");
        c1.abrirConta("CC");

        Conta c2 = new Conta(0, null, null, 0, null);
        c2.setnumConta(2222);
        c2.setDono("Humberto");
        c2.abrirConta("CP");

        c1.Depositar(100);
        c2.Depositar(500);
        c2.Sacar(100);

        c1.Sacar(150);
        c1.fecharConta();

        c1.estadoAtual();
        c2.estadoAtual();
    }
}
