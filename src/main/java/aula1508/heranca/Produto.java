package aula1508.heranca;

public class Produto {

    private String nome;

    private Float preço;

    private String codigo;

    public Produto() {
    }

    public Produto(String nome, Float preço, String codigo) {
        this.nome = nome;
        this.preço = preço;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getPreço() {
        return preço;
    }

    public void setPreço(Float preço) {
        this.preço = preço;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
