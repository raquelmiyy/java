import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Data {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now(); // pega data local de agora
        System.out.println(data);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println(dataHora);

        DateTimeFormatter formatadorDeData = DateTimeFormatter.ofPattern("dd/MMM/yyyy", Locale.CHINA);
        System.out.println(data.format(formatadorDeData));
    }
}
