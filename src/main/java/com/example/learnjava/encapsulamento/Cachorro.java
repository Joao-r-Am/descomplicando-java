package com.example.learnjava.encapsulamento;

public class Cachorro {

    //private só acessa dentro da classe
    private Double peso;
    private Integer idade;

    //tudo no projeto tem acesso
    public  double pesoPublic;
    public  Integer idadePublic;

    //apenas o pacote tem acesso
    protected Double pesoProtected;
    protected Integer idadeProtected;

    //tudo no projeto tem acesso
    public String latir() {
        return  "AUAUAUAUAUAUUA!!!!!!!!!!!!!!";
    }

    protected String amimir() {
        return "zzzzzzzzzzzzzzzzzzzzzz";
    }

    private String comer() {
        return "hora do rango!!!!!!";
    }

}
