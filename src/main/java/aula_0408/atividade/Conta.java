package aula_0408.atividade;

public class Conta {

    private String numeroConta;

    private Double saldo;

    private Cliente cliente;


    public Conta(String numeroConta, Double saldo, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;    }


    public double saque(double valorSaque){
        if(saldo > valorSaque){
            return saldo -= valorSaque;
        }
        System.out.println("Saldo insuficiente");
        return  saldo;
    }


    public double deposito(double valorDeposito){
        return saldo += valorDeposito;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroConta='" + numeroConta + '\'' +
                ", saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
