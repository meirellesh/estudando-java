package IntroduçãoJava;

import java.util.Scanner;

public class EstudoEstruturas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Digite o seu peso: ");
        double peso = entrada.nextDouble();

        double IMC = peso / (altura * altura);

        System.out.println(nome + " tem o IMC igual a: " + IMC);

        System.out.println("Coloque a quantidade de repetições do while: ");
        int total = entrada.nextInt();

        int i = 0;
        while (i < total) {
            System.out.println("Você gosta de batata!");
            i++;
        }
    }
}
