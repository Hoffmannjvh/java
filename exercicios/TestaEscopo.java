package exercicios;

public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

        int idade = 18;
        int quantidadePessoas = 3;

        boolean acompanhado = true;

        if(quantidadePessoas >= 2 ) {
            acompanhado = true;
        }else {
            acompanhado = false;
        }

        System.out.println("Valor de acompanhado =" + acompanhado);

        if (idade>=18 && acompanhado) {
            System.out.println("Seja bem vindo");
        } else {
                System.out.println("Você precisa completar 18 anos");
            }  
        }
    }