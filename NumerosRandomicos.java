import java.util.concurrent.ThreadLocalRandom;

public class NumerosRandomicos {
    public static void main(String[] args) {
        Integer numeroRandomico =
                ThreadLocalRandom.current().nextInt(10);
        System.out.println(numeroRandomico);

        Double numeroRandomicoReal =
                ThreadLocalRandom.current().nextDouble(1, 10.0);
        System.out.println(numeroRandomicoReal);

        System.out.println(ThreadLocalRandom.current().nextDouble(10));
    }
}
