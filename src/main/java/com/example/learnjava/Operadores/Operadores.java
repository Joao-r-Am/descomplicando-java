package com.example.learnjava.Operadores;

public class Operadores {

    public static void main(String[] args){
        // operador de atribuição
        int idade = 22;
        System.out.println("minha idade " + idade);

        // operadores matematicos
        int soma = idade + 5;
        System.out.println("resultado soma " + soma);

        int multiplicacao = soma * 2;
        System.out.println("resultado multiplicacao " + multiplicacao);

        int divisao = multiplicacao / 2;
        System.out.println("resultado divisao " + divisao);

        int moduloo = divisao % 2;
        System.out.println("resultado modulo " + moduloo);

        // incremento
        int incremento = 15;
        System.out.println("Valor original antes do incremento " + incremento);
        incremento++;
        System.out.println("Valor do incremento apos a adiçao " + incremento);

        // decremento
        int decremento = 15;
        System.out.println("Valor original antes do decremento " + decremento);
        decremento--;
        System.out.println("Valor do decremento apos a subtração " + decremento);

        // operadores de igualdade
        long v1 = 1L;
        long v2 = 2L;

        // se iguais
        if(v1 == v2) {
            System.out.println("Os valores sao iguais");
        } else {
            System.out.println("Os valores sao diferentes");
        }

        double v3 = 10.2;
        double v4 = 100.2;

        // se diferentes
        if(v3 != v4) {
            System.out.println("Os valores sao diferentes");
        } else {
            System.out.println("Os valores sao iguais");

        }

    // operadores relacionais
        int primeiroValor = 1234;
        int segundoValor = 12345;

        // se maior
        if(primeiroValor > segundoValor){
            System.out.println(primeiroValor + " é maior que " + segundoValor);
        }
        // se maior ou igual
        if(primeiroValor >= segundoValor){
            System.out.println(primeiroValor + " é maior ou igual a " + segundoValor);
        }
        // se menor
        if(primeiroValor < segundoValor){
            System.out.println(primeiroValor + " é menor que " + segundoValor);
        }
        // se menor ou igual
        if(primeiroValor <= segundoValor){
            System.out.println(primeiroValor + " é menor ou igual a " + segundoValor);
        }

        //operadores logicos
        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro && falso);

    }

}
