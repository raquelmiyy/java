import java.util.concurrent.ThreadLocalRandom;

public class Votacao {
    public static void main(String[] args) {
     Integer mussarela = 0;
     Integer calabresa;
     Integer quatroQueijo;
     Integer votacao;

     Integer contador = 0;
     while (contador < 10){
         votacao = ThreadLocalRandom.current().nextInt(1,4);
         System.out.println(votacao);
         contador++;

     }
        System.out.println();


    }
}
