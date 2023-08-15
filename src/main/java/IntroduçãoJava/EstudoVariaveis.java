package IntroduçãoJava;

public class EstudoVariaveis {
    //variavel = container de dados
    //tipagem forte = definir o tipo de cada variável
    public static void main(String[] args) {
        //pra definir uma variavel
        // <tipo> <nome> = <valor>;

        //Como declarar variáveis?
        int estoque = 150; // Até 2 bilhões
        // L = sufixo para representar long
        long populacaoTerra = 7900000000L; // até an casa dos quintilhões
        double salarioDev = 5500.99;
        // F = sufixo para representar float
        float nota = 7.5F; // Até 7 casas de precisão
        boolean ativo = true; // true, false
        String nome = "José Almir"; //usamos aspas duplas sempre
        char letra = 'A';
        System.out.println(nome.contains("a"));
        //Tipagem forte
        int a = 1000;
        a = 2000; // reatribuição/atualização
   }
}


