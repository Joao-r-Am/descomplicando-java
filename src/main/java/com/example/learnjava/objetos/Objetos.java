package com.example.learnjava.objetos;

public class Objetos {
    public static void main (String[] args) {
        Estudante joaoDev = new Estudante();
        joaoDev.setName("João");
        joaoDev.setStack("Java e spring");
        joaoDev.estudar();
        joaoDev.dormir();

        System.out.println(joaoDev.getName());
        System.out.println(joaoDev.getStack());
    }

}
