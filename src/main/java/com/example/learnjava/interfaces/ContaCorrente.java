package com.example.learnjava.interfaces;

public class ContaCorrente implements Conta {

    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é R$ -100");
    }

    @Override
    public void fazerPix() {
        System.out.println("digite o valor do pix!!!!!");
    }
}
