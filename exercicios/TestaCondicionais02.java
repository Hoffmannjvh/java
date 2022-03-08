package exercicios;

public class TestaCondicionais02 {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

        int idade = 18;
        boolean acompanhado = true;

        if (idade>=18 && acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
                System.out.println("Você precisa completar 18 anos");
            }  
        }
    }