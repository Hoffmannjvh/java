package exercicios;

public class TestaCondicionais {
    public static void main(String[] args) {
        System.out.println("Testando Condicionais");

        int idade = 15;
        int quantidadePessoas = 1;

        if (idade>=18) {
            System.out.println("Você é maior de idade");
        } else {
            if (quantidadePessoas >=2) {
                System.out.println("Você é menor de idade, mas pode entrar, " + " porque esta acompanhado (a)");
            } else {
                System.out.println("Você precisa completar 18 anos");
            }
            
        }
    }
}