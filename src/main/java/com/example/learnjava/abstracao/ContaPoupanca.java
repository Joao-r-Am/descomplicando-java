package com.example.learnjava.abstracao;

public class ContaPoupanca extends Conta {


    @Override
    public void consultarSaldo() {
     System.out.println("O saldo da sua conta é insuficiente!");
    }

    @Override
    public void fazerPix() {
        System.out.println("deu ruim :O");
    }
}
