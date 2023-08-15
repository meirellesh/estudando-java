package IntroduçãoJava;

public class EstudoOperadores {
    public static void main(String[] args) {
//        //Operadores matemáticos
//        int a = 10;
//        int b = 15;
//        int soma = a + b;
//        int subtracao = a - b;
//        int multiplicacao = a * b;
//        int divisao = b / a;
//
//        System.out.println("Soma: " + soma);
//        System.out.println("Subtração: " + subtracao);
//        System.out.println("Multiplicação: " + multiplicacao);
//        System.out.println("Divisão: " + divisao);
//
//        double divisao2 = (double) b / (double) a;
//        System.out.println("Divisao2: " + divisao2);
//
//        //Math
//        double x = Math.pow(2,3);
//        double y = Math.sqrt(144);
//        System.out.println("Valor de 2³: " + x );
//        System.out.println("Raiz de 144 é: " + y);
//        // Incremento / Decremento
//        int valor = 5;
//        valor ++;
//        System.out.println(valor);
//
//        // Operadores relacionais
//        boolean teste1 = 10 > 5; // true
//        boolean teste2 = 1 > 5; // false
//        boolean teste3 = 5 == 5; //true
//        boolean teste4 = 4!= 5; //true
//        System.out.println(teste1);
//        System.out.println(teste2);
//        System.out.println(teste3);
//        System.out.println(teste4);

        // Crie duas variaveis: peso e altura
        // Calcule o IMC = peso / (altura * altura)
        // Mostre na tela o IMC

        double peso = 66.5;
        double altura = 1.75;

        double IMC = peso / (altura * altura);
        if (IMC < 18.5) {
            System.out.println("O IMC é: " + IMC + " Classificação: Magreza");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("O IMC é: " + IMC + " Classificação: Normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("O IMC é: " + IMC + " Classificação: Sobrepeso");
        } else if (IMC >= 30 && IMC <= 39.9) {
            System.out.println("O IMC é: " + IMC + " Classificação: Obesidade");
        } else {
            System.out.println("O IMC é: " + IMC + " Classificação: Obesidade Grave");

        }




    }


}
