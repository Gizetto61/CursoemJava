package Projeto01;

import java.util.Scanner;

public class Conta {
    public int numConta;
    protected String Tipo;
    private String Dono;
    private double Saldo;
    private Boolean Status;

    Scanner sc = new Scanner(System.in);

    public Conta(int numconta, String tipo, String dono, double saldo, Boolean status) {
        // this.numConta = numconta;
        // this.Tipo = tipo;
        // this.Dono = dono;
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getnumConta() {
        return numConta;
    }

    public void setnumConta(int numconta) {
        this.numConta = numconta;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public String getDono() {
        return Dono;
    }

    public void setDono(String dono) {
        this.Dono = dono;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        this.Saldo = saldo;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        this.Status = status;
    }

    public void estadoAtual() {
        System.out.println("========================");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if (tipo == "CC") {
            setSaldo(50.00);
        } else if (tipo == "CP") {
            setSaldo(150.00);
        }
        /*
         * System.out.println("Deseja abrir qual tipo de conta?");
         * System.out.println("Corrente [CC] ou Poupança [CP]? ");
         * Tipo = sc.nextLine();
         * // setTipo(sc.nextLine());
         * if (Tipo == "CC") {
         * setTipo("Corrente");
         * setSaldo(50.00);
         * System.out.println("Conta Aberta!");
         * System.out.println("Número: " + getnumConta());
         * System.out.println("Dono: " + getDono());
         * System.out.println("Tipo: " + getTipo());
         * System.out.println("Saldo: R$" + getSaldo());
         * System.out.println("Status: " + getStatus());
         * } else {
         * setTipo("Poupança");
         * setSaldo(150.00);
         * System.out.println("Conta Aberta!");
         * System.out.println("Número: " + getnumConta());
         * System.out.println("Dono: " + getDono());
         * System.out.println("Tipo: " + getTipo());
         * System.out.println("Saldo: R$" + getSaldo());
         * System.out.println("Status: " + getStatus());
         * }
         * // this.Status = "Aberta";
         * setStatus("Aberta");
         */
    }

    public void fecharConta() {
        if (getStatus() == true && getSaldo() == 0) {
            // this.Status = "Fechada";
            setStatus(false);
            System.out.println("Fechada com SUCESSO!");
        } else if (getSaldo() > 0) {
            System.out.println("Não foi possível Fechar sua conta pois há dinheiro nela!");
        } else if (getSaldo() < 0) {
            System.out.println("Não foi possível Fechar sua conta pois ela está em débito!");
        }
    }

    public void Depositar(double valor) {
        if (getStatus() == true) {
            setSaldo(getSaldo() + valor);
            System.out.println("R$" + valor + " depoditado na conta de " + getDono());
        } else {
            System.out.println("Impossível Depositar!");
        }
    }

    public void Sacar(double valor) {
        if (getStatus() == true && getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("R$" + valor + " sacados da conta de " + getDono());
        } else {
            System.out.println("Conta Inesistente ou Saldo Insuficiente!");
        }
    }

    public void pagarMensal() {
        double v = 0;
        if (getTipo() == "CC") {
            v = 12;
        } else if (getTipo() == "CP") {
            v = 20;
        }
        if (getStatus() == true && getSaldo() > v) {
            setSaldo(getSaldo() - v);
            System.out.println("Mensalidade paga com SUCESSO!");
        } else {
            System.out.println("Conta Inesistente ou Saldo Insuficiente!");
        }
    }
}
