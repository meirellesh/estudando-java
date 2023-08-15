package IntroduçãoJava;

import java.time.LocalDate;
import java.util.*;
import java.time.format.DateTimeFormatter;

public class Atividade0108 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();


        System.out.println("Digite os números: ");

        int numero;
        while (true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            numeros.add(numero);
        }

        scanner.close();

        // Imprime os números armazenados na lista
        System.out.println("Números digitados: " + numeros);

        Collections.sort(numeros);

        System.out.println("Números ordenados menor para o maior: " + numeros);

        System.out.println("O menor número é: " + numeros.get(0));

        Collections.sort(numeros, Comparator.reverseOrder());

        System.out.println("Números ordenados maior para o menor: " + numeros);

        System.out.println("O maior número é: " + numeros.get(0));

        int soma = 0;

        for(int i = 0; i < numeros.size(); i++){

            soma += numeros.get(i);
        }

        double mediaAritimetica = (double) soma/numeros.size();

        System.out.println("A média aritmética é: " + mediaAritimetica);

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate dataFutura = hoje.plusYears(5);

        System.out.println(dataFutura);



    }


    }

