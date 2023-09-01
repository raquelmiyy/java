import java.util.concurrent.ThreadLocalRandom;

public class Acumulador {
    public static void main(String[] args) {
        Integer numerosSorteados;
        Integer somaGeral = 0;

        Integer contador = 0;
        do {
            numerosSorteados = ThreadLocalRandom.current().nextInt(0,11);
            System.out.println(numerosSorteados);
            somaGeral += numerosSorteados;
            contador++;

        } while (numerosSorteados != 0);


        System.out.println("A soma dos números é: " + somaGeral);
    }
}
