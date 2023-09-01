package com.example.learnjava.polimorfismo.sobrescrita;

public class BotaoTV  extends Botao{
    @Override
    public void ligar() {
        // super.ligar();
        System.out.println("ligando a tv");
    }

    @Override
    public void desligar() {
        //super.desligar();
        System.out.println("voce ainda esta ai ( ͡• ͜ʖ ͡• ), vou desligar");
    }
}
