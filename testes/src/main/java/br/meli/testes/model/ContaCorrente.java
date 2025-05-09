package br.meli.testes.model;

public class ContaCorrente {
    private int numero;
    private double saldo;

    public ContaCorrente() {
    }

    public ContaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean sacar(double saque) {
        if(saque > 0 && saldo >= saque){
            saldo -= saque;
            return true;
        }
        return false;
    }
}
