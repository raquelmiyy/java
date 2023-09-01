import java.util.concurrent.ThreadLocalRandom;
        public class Loteria {
            public static void main(String[] args) {
                Integer numero = 3;
                Integer numerosAleatorios;

                Integer contador = 0;
                do {
                    numerosAleatorios = ThreadLocalRandom.current().nextInt(0,11);
                    System.out.println(numerosAleatorios);
                    contador++;
                }while (numerosAleatorios != numero);
                System.out.println("contador " + contador);

                if (contador <= 3) {
                    System.out.println("Você é MUITO sortudo");
                } else {
                    if (contador < 4 || contador > 10) {

                        System.out.println("É melhor você parar de apostar e ir trabalhar");
                    } else {
                        System.out.println("Você é sortudo");
                    }
                }


            }
        }

