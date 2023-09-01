package com.example.learnjava.heranca;

public class Pessoa {
    public static void main(String[] args){
        PessoaDesenvolvedoraBackend pessoaDesenvolvedoraBackend = new PessoaDesenvolvedoraBackend("JoãoBackend", "java e spring", 3500.00);
        pessoaDesenvolvedoraBackend.codar();

        PessoaDesenvolvedoraFrontend pessoaDesenvolvedoraFrontend = new PessoaDesenvolvedoraFrontend("JoãoFrontend", "javascript e react", 3500.00);
        pessoaDesenvolvedoraFrontend.codar();
    }
}
