package aula1508.heranca;

import java.time.LocalDate;

public class Carne extends Comida{

    private String categoria;

    public Carne() {
    }

    public Carne(String nome, Float preço, String codigo, LocalDate prazoDeValidade, Float caloria, String categoria) {
        super(nome, preço, codigo, prazoDeValidade, caloria);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
