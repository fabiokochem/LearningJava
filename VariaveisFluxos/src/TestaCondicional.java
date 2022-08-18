package VariaveisFluxos.src;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testando condicionai");

        int idade = 20, quantidadePessoas = 3;

        if(idade >= 18){
            System.out.println("Você tem mais de 18 anos! Seja bem-vindo.");
        } else if(quantidadePessoas >= 2){
            System.out.println("Você pode entrar por estar acompanhado! Seja bem-vindo.");
        } else {
            System.out.println("Infelizmente você não pode entrar.");
        }

    }
}
