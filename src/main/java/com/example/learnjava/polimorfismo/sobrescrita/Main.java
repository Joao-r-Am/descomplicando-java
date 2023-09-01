package com.example.learnjava.polimorfismo.sobrescrita;

public class Main {
    public static void main(String[] args){
        BotaoFogao botaoFogao = new BotaoFogao();
        botaoFogao.ligar();
        botaoFogao.desligar();

        BotaoTV botaoTV = new BotaoTV();
        botaoTV.ligar();
        botaoTV.desligar();
    }
}
