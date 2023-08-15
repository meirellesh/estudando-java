package aula_0408.atividade;

public class Principal {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", 30, "123456789");
        Cliente cliente2 = new Cliente("Maria", 25, "987654321");

        Banco banco = new Banco();

        banco.criarConta(cliente1);
        banco.criarConta(cliente2);

        Conta conta1 = banco.getContas().get(0);
        Conta conta2 = banco.getContas().get(1);

        conta1.deposito(1000);
        conta2.deposito(3500);

//        System.out.println(conta1.getSaldo());

        System.out.println(conta1);

    }
}
