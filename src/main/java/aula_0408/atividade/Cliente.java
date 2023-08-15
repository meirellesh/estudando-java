package aula_0408.atividade;

public class Cliente {

    private String nome;
    private Integer idade;

    private String cpf;

    public Cliente() {}

    public Cliente(String nome, Integer idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;    }



    @Override
    public String toString() {
        return  "{nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
