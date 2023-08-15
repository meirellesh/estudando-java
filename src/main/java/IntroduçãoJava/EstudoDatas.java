package IntroduçãoJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class EstudoDatas {
    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);
        System.out.println("ano" + dataHoraAtual.getYear());
        System.out.println("mes" + dataHoraAtual.getMonthValue());
        System.out.println("dia " + dataHoraAtual.getDayOfMonth());
        System.out.println(dataHoraAtual.getDayOfWeek());

        int ano = 2023;
        int mes = 12;
        int dia = 7;
        LocalDate dataValida = LocalDate.of(ano, mes, dia);
        System.out.println(dataValida);

        LocalDate data1 = LocalDate.now();
        LocalDate data2 = LocalDate.of(2023, 8, 2);
        if (data2.isAfter(data1)) {
            System.out.println();
        }

    }
}