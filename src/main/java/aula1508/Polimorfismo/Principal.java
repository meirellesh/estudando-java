package aula1508.Polimorfismo;

public class Principal {

    public static void main(String[] args) {

        Animal rato = new Animal("Rato","Mus musculus","Terrenos Baldios");
        System.out.println(rato.getNome());

        Animal gato = new Gato();

        Animal cachorro = new Cachorro();
        Gato gato0 = new Gato();

        // gato.setCorPelo(); Invalido -- Tem que usar a classe gato para buscar informações especificas da classe
        //Se usar a classe animal com polimorfismo, apenas atributos/métodos de Animal sao encontrados
        gato0.setCorPelo("Laranja");


        gato.emitirSom();
        cachorro.emitirSom();

    }
}
