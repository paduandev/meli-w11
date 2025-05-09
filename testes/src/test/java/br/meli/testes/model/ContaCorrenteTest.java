package br.meli.testes.model;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ContaCorrenteTest {
    
    @Test
    void sacar_returnTrue_whenSaldoSuficiente() {
        double saldoInicial = 100;
        double saque = 50;

        ContaCorrente cc = new ContaCorrente(1, saldoInicial);
        // cc.depositar(saldoInicial);

        boolean resultado = cc.sacar(saque);

        assertThat(resultado).isTrue();
        assertThat(cc.getSaldo()).isEqualTo(saldoInicial-saque);
    }

    @Test
    void sacar_returnFalse_whenSaldoInsuficiente() {
        double saldoInicial = 0;
        double saque = 50;

        ContaCorrente cc = new ContaCorrente(1, saldoInicial);

        boolean resultado = cc.sacar(saque);

        assertThat(resultado).isFalse();
        assertThat(cc.getSaldo()).isEqualTo(saldoInicial);
    }

    @Test
    void sacar_returnFalse_whenSaqueInvalido() {
        double saldoInicial = 100;
        double saque = -50;

        ContaCorrente cc = new ContaCorrente(1, saldoInicial);

        boolean resultado = cc.sacar(saque);

        assertThat(resultado).isFalse();
        assertThat(cc.getSaldo()).isEqualTo(saldoInicial);
    }


}
