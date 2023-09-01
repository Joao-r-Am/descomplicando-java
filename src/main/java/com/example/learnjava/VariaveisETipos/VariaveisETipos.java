package com.example.learnjava.VariaveisETipos;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class VariaveisETipos extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // valores inteiros ou negativos, requer 8 bits, maximo 127 e minimo -128
        byte meubyte = 127;
        System.out.println("meu byte " + meubyte);

        // dobro de bit do byte, min -32768 e max 32767
        short meuShort = 32767;
        System.out.println("meu short " + meuShort);

        // usa 32 bits, min -2147483648 e max 2147483647
        int idade =  22;
        System.out.println("um int " + idade);

        // 64 bits
        long meuLong = 10L;
        System.out.println("um long " + meuLong);

        // dupla precisao, 64 bits
        double salario = 102.51;
        System.out.println("meu double " + salario);
        // precisao simples, 32 bits
        float salarioFloat = 102.55F;
        System.out.println("meu float " + salarioFloat);

        // 16 bits, um unicode
        char letra = 'J';
        System.out.println("meu char " + letra);

        // 1 bit
        boolean eresTrue = true;
        System.out.println("meu boolean " + eresTrue);
    }

    public static void main(String[] args) {
        launch();
    }
}