package com.example.learnjava.CondicionaisERepeticao;

public class Condicionais {
    public static void main(String[] args){

        //if-else & else-if

        long v1 = 16643464343636L;
        long v2 = 1646326234L;

        if(v1 ==  v2){
            System.out.println("São iguais");
        } else if (v1 < v2){
            System.out.println("valor 1 é menor que o valor 2");
        } else {
            System.out.println("valores diferentes");
        }

        // switch case

        String nomeDoMes = "fevereiro";

        switch (nomeDoMes){
            case "janeiro":
                System.out.println(1);
                break;
            case "fevereiro":
                System.out.println(2);
                break;
            case "março":
                System.out.println(3);
                break;
            case "abril":
                System.out.println(4);
                break;
            case "maio":
                System.out.println(5);
                break;
            case "junho":
                System.out.println(6);
                break;
            default: System.out.println("que mes é esse?");
            break;
        }

    }
}
