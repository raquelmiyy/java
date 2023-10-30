public class Termometro {
    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;


    void aumentaTemperatura(Double aumento) {
        temperaturaAtual += aumento;
        if (temperaturaAtual > temperaturaMax) {
            temperaturaAtual = temperaturaMax;
        }
    }

    void diminuiTemperatura(Double diminuicao) {
        temperaturaAtual -= diminuicao;
        if (temperaturaAtual < temperaturaMin) {
            temperaturaAtual = temperaturaMin;
        }
    }

    void exibeFahreinheit() {
        double temperaturaFahreinheit = (temperaturaAtual * 9 / 5) + 32;
        System.out.println("Temperatura atual em Fahrenheit: " + temperaturaFahreinheit + " °F");
    }
}

