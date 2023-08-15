package aula1508.Polimorfismo;

public class Gato extends Animal {

    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom(){
      System.out.println("Miau");
    }
}
