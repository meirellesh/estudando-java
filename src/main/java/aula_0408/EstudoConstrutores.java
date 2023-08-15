package aula_0408;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EstudoConstrutores {
    public static void main(String[] args) {

        List<String> produtos = new ArrayList<String>();
        produtos.add("Sapato");
        produtos.add("Cerveja");
        produtos.add("Livro");
        Venda venda = new Venda(LocalDate.now(), "José", produtos, 300.0);
        Venda venda1 = new Venda();
        Venda venda2 = new Venda(LocalDate.now());
        Venda venda3 = new Venda(LocalDate.now(),"Henrique");
        System.out.println(venda);
    }


}


