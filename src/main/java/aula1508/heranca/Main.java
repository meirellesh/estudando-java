package aula1508.heranca;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Produto batata = new Produto ("Batata", 8.5F, "1579563");
        System.out.println(batata.getNome());

        Produto melao = new Produto();
        melao.setNome("melao");
        System.out.println(melao.getNome());

        Produto maca = new Produto ("Maca", 3.5F,"1569631");
        System.out.println(maca.getNome());


        Livro cleanCode = new Livro("CleanCode",100.0F,"987654321","123.123.123.123",300);
        System.out.println(cleanCode.getCodigo());

        Livro segundoLivro = new Livro();

        Comida tapioca = new Comida("Tapioca", 5.0F, "465488965", LocalDate.of(2023,9,30),300.0F);

        System.out.println(tapioca.getNome());

        Carne gado = new Carne("Picanha", 100.0F,"12345678905343",LocalDate.of(2023,10,26),1000.F,"Vaca");

    }
}
