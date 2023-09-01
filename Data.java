package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Data {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now(); // Iniciando o LocalDate com a data atual
        LocalDateTime dataHora = LocalDateTime.now(); // Iniciando o LocalDateTime com a data hora atual

        System.out.println(data);
        System.out.println(dataHora);

        /*
            Padrões de formatações:
            dd/M/yyyy hh:mm:ss -> 30/8/2023 03:43:39
            dd/MM/yyyy hh:mm:ss -> 30/08/2023 03:43:39
            dd/MMM/yyyy hh:mm:ss -> 30/ago./2023 03:43:39
            dd/MMMM/yyyy hh:mm:ss -> 30/agosto/2023 03:43:39
            dd/MM/yy hh:mm:ss -> 30/08/23 03:43:39
            dd/MM/yyyy hh:mm:ss:ms -> 30/08/23 03:43:39:511
            dd/MM/yyyy HH:mm:ss:ms -> 30/08/23 20:43:39:511
         */
        DateTimeFormatter formatadorDeData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorDeDataHora = DateTimeFormatter.ofPattern("dd/MMMM/yyyy hh:mm:ss:ms", Locale.forLanguageTag("pt-BR"));

        System.out.println(formatadorDeData.format(data));
        System.out.println(formatadorDeDataHora.format(dataHora));

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma data: (dd/mm/aaaa)");// o formato digitado é muito importante
        LocalDate dataDigitada = LocalDate.parse(leitor.nextLine(), formatadorDeData);

        System.out.println(dataDigitada);

        System.out.println(dataDigitada.minusDays(1)); // menos um dia
        System.out.println(dataDigitada.minusMonths(1)); // menos um mes
        System.out.println(dataDigitada.minusYears(1)); // menos um ano
        System.out.println(dataDigitada.minusWeeks(1)); // menos uma semana

        System.out.println(dataDigitada.plusDays(1)); // mais um dia
        System.out.println(dataDigitada.plusMonths(1)); // mais um mes
        System.out.println(dataDigitada.plusYears(1)); // mais um ano
        System.out.println(dataDigitada.plusWeeks(1)); // mais uma semana

        // comparando datas
        if (data.isAfter(dataDigitada)) {
            System.out.println("Data de hoje está depois da data digitada");
        } else if (data.isBefore(dataDigitada)) {
            System.out.println("Data de hoje está antes da data digitada");
        } else {
            System.out.println("Data de hoje é igual a data digitada");
        }

        // Retornando o dia da semana
        // obs: o valor 1 represente segunda e o valor 7 representa domingo
        Integer diaDaSemana = dataDigitada.getDayOfWeek().getValue();
        System.out.println("Dia da semana: " + diaDaSemana);

    }
}
