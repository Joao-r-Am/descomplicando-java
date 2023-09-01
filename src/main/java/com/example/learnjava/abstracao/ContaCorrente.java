package com.example.learnjava.abstracao;

public class ContaCorrente extends Conta {


    @Override
    public void consultarSaldo() {
        System.out.println("Seu saldo é R$ -50,00");
    }

    @Override
    public void fazerPix() {
        System.out.println("Qual valor deseja transferir:");
    }
}
