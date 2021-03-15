package com.senac;

public class Main {

    public static void main(String[] args) {
        int idade = 15;
        boolean brasileiro = true;
        boolean disponibilidadeVespertino = true;

        cadastrar(idade, brasileiro, disponibilidadeVespertino);

    }

    private static void cadastrar(int idade, boolean brasileiro, boolean disponibilidadeVespertino) {
        if (verificarMaiorIdade(idade)) {
            if (verificarNacionalidade(brasileiro)) {
                if (verificarDisponibilidadeVespetino(disponibilidadeVespertino)) {
                    System.out.println("Parabéns! Cadastro realizado");
                } else {
                    System.out.println("Verifique a mensagem de erro.");
                }
            }
        }
    }

    private static boolean verificarDisponibilidadeVespetino(boolean disponibilidadeVespertino) {
        if (disponibilidadeVespertino) {
            System.out.println("Tem DISPONIBILIDADE a tarde");
            return true;
        } else {
            System.out.println("Não tem disponibilidade pra tarde");
            return false;
        }
    }

    private static boolean verificarNacionalidade(boolean brasileiro) {
        if (brasileiro) {
            System.out.println("É Brasileiro");
            return true;
        } else {
            System.out.println("Não é Brasileiro");
            return false;
        }
    }

    private static boolean verificarMaiorIdade(int idade) {
        if (idade >= 18) {
            System.out.println("É maior de idade");
            return true;
        } else {
            System.out.println("Não é maior de idade");
            return false;
        }
    }
}