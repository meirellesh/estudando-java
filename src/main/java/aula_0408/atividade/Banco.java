package aula_0408.atividade;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    private String gerarNumeroConta (){
        return  Math.random() + "-X";
    }

    public void criarConta(Cliente cliente){
        String numeroConta = gerarNumeroConta();
        Conta novaConta = new Conta (numeroConta, 0.0, cliente);
        contas.add(novaConta);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "contas=" + contas +
                '}';
    }
}
