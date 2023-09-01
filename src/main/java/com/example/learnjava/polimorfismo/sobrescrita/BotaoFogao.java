package com.example.learnjava.polimorfismo.sobrescrita;

public class BotaoFogao extends Botao{
    @Override
    public void ligar() {
        // super.ligar();
        System.out.println("esquentando a comida");
    }

    @Override
    public void desligar() {
        super.desligar();
    }
}
