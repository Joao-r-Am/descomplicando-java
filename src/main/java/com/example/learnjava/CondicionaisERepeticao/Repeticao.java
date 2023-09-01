package com.example.learnjava.CondicionaisERepeticao;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Scanner;

public class Repeticao {

    public static void main(String[] args) {
        // for
        for (int i = 0; i <= 100; i++){
            //System.out.println("Nessa repetiçaõ i vale: " + i);
        }

        //while
//        Scanner in = new Scanner(System.in);
//        var valorSecreto = 0;
//        while (valorSecreto != 12345){
//            System.out.println("Adivinhe o valor secreto");
//            valorSecreto = in.nextInt();
//            if(valorSecreto == 12345){
//                System.out.println("Parabens vc acerrtou!!!!!!");
//            } else {
//                System.out.println("Valor errado, tente novamente");
//            }
//        }

        //do-while
        int valor = 10;
        do{
            System.out.println(valor);
            valor++;
        } while (valor <= 50);
    }

}
