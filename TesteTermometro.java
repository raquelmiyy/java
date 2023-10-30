public class TesteTermometro {
    public static void main(String[] args) {

        Termometro termometro = new Termometro();

        termometro.temperaturaAtual = 25.0;
        termometro.temperaturaMax = 30.0;
        termometro.temperaturaMin = 10.0;

        termometro.aumentaTemperatura(5.0);
        System.out.println("Temperatura atual: " + termometro.temperaturaAtual);


        termometro.diminuiTemperatura(15.0);
        System.out.println("Temperatura atual: " + termometro.temperaturaAtual);

        termometro.exibeFahreinheit();
}}
