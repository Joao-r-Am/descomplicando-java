package com.example.learnjava.array;

import java.util.Arrays;
import java.util.List;

public class Array{
    public static  void main (String[] args){
        // estrutura de dados simples para armazenar uma coleção de elementos

        // forma mais comum de declaração de array
        int [] arrayDeInt[];
        // forma menos comum
        int arrayDeInt2 [];

        // inicializando um array com quantidaded elementos ja declarados
        int[] arrayDeInt3 = new int[10];

        // preenchendo o array
        Integer[] arrayDeInt4 = {1,2,3,4,5,6,7,8,9,10};

        // descobrindo o tamanho do array
        int arraySize = arrayDeInt4.length;
//        System.out.println("Tamanho do array é " + arraySize);

        // percorrendo o array
        List<Integer> itens = Arrays.asList(arrayDeInt4);
//        itens.forEach(System.out::println);

        //copinado um array - copyOfRange
        String [] treinamento = new String[]{
                "treinamento",
                "descomplicando",
                "java",
                "e",
                "spring",
                "dos",
                "guri"
        };

        String[] treinamentoNome = Arrays.copyOfRange(treinamento, 1, 7);
        List<String> treinamentoNomeList = List.of(treinamentoNome);
        List<String> treinamentoList = List.of(treinamentoNome);
//        treinamentoNomeList.forEach(System.out::println);
//        treinamentoList.forEach(System.out::println);

        //copy of - nao conseche escolher o range
        String[] arrayCom2 = Arrays.copyOf(treinamentoNome, 2);
        List<String> arrayCom2List = List.of(arrayCom2);
//        arrayCom2List.forEach(System.out::println);


        // preenchendo um array - fill
        String[] java = new String[10];
        Arrays.fill(java, "java");
        List<String> javaList = List.of(java);
//        javaList.forEach(System.out::println);

        int[] arrayInt1 = {1,2,3,4,5,6,7,8,9};
        int[] arrayInt2 = {1,2,3,4,5,6,7,8,9};

//        System.out.println("Os arrays são iguais?? " + Arrays.equals(arrayInt1, arrayInt2));

        //sorted - ordenação
        String[] sorted =  Arrays.copyOf(treinamento, 7);
        Arrays.sort(sorted);
        List<String> sortedList = List.of(sorted);
        sortedList.forEach(System.out::println);

    }

}
