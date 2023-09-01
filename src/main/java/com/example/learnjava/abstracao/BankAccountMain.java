package com.example.learnjava.abstracao;

public class BankAccountMain {

    public static void main(String[] args){
        System.out.println("Olá seja bem vindo ao bancolas!");
        ContaCorrente ccJoao = new ContaCorrente();
        ccJoao.consultarSaldo();
        ccJoao.fazerPix();

        ContaPoupanca cpJoao = new ContaPoupanca();
        cpJoao.consultarSaldo();
        cpJoao.fazerPix();
    }

}
