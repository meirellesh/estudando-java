package aula1508.heranca;

public class Livro extends Produto {

    private String isbn;

    private Integer numPaginas;

    public Livro(){
        super();
    }

    public Livro(String nome, Float preço, String codigo, String isbn, Integer numPaginas) {
        super(nome, preço, codigo);
        this.isbn = isbn;
        this.numPaginas = numPaginas;
    }



    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }
}
