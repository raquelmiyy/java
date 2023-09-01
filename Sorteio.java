import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {
    public static void main(String[] args) {


        // CORREÇÃO PROFESSOR

        Integer escolha = 37;
        Boolean encontrado = false;
        Integer qtdPares = 0;
        Integer qtdImpares = 0;

        for (int i = 1; i < 201; i++) {
            Integer sorteio  = ThreadLocalRandom.current().nextInt(1,101);

            if (escolha.equals(sorteio) && !encontrado) {
                System.out.println("posição :" + i);
                encontrado = true;
            }

            if (sorteio % 2 == 1) {
                qtdImpares++;
            }

            if (sorteio % 2 == 0) {
                qtdPares++;
            }
            System.out.println(sorteio);

        }
        System.out.println("pares: " + qtdPares);
        System.out.println("ímpares " + qtdImpares);


    }
}
