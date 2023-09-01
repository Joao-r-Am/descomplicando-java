package com.example.learnjava.interfaces;

public class ContaPoupanca implements Conta{
    @Override
    public void consultarSaldo() {
        System.out.println("saldo de 1");
    }

    @Override
    public void fazerPix() {
        System.out.println("pix fazido!!!");
    }
}
