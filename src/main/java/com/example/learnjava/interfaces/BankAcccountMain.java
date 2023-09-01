package com.example.learnjava.interfaces;

public class BankAcccountMain {
    public static void main(String[] args) {

        System.out.println("bom vindo ao fodase");

        ContaCorrente ccJoao = new ContaCorrente();
        ccJoao.consultarSaldo();
        ccJoao.fazerPix();


        ContaPoupanca cpJoao = new ContaPoupanca();
        cpJoao.consultarSaldo();
        cpJoao.fazerPix();
    }
}
