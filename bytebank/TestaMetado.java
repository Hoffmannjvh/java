package bytebank;

public class TestaMetado {
    public static void main(String[] args) {
        Conta contaDoJoao = new Conta();
        contaDoJoao.saldo = 100;
        contaDoJoao.deposita(50);
        System.out.println(contaDoJoao.saldo);

        boolean conseguiuRetirar = contaDoJoao.saca(20);
        System.out.println(contaDoJoao.saldo);
        System.out.println(conseguiuRetirar);
        

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
        
        boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoJoao);
        if(sucessoTransferencia) {
            System.out.println("Transferencia com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoJoao);
    }
}
