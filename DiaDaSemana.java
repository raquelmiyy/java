import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        DateTimeFormatter formatadorDeData = DateTimeFormatter.ofPattern("dd");

        System.out.println("Digite uma data:");
        LocalDate data = LocalDate.parse(leitor.nextLine(), formatadorDeData);

        System.out.println(data);
    }
}
