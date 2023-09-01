
import java.util.Scanner;

public class TesteCalculoNutricao {
    public static void main(String[] args) {

        CalculoNutricao calc = new CalculoNutricao();

        Scanner leitor = new Scanner(System.in);


        System.out.println("Quantas vezes quer calcular: ");
        Double qtdCalculada = leitor.nextDouble();

        for (int i = 0; i < qtdCalculada; i++){
            System.out.println("Digite seu peso: ");
            Double peso = leitor.nextDouble();
            System.out.println("Digite sua altura: ");
            Double altura = leitor.nextDouble();

            Double exibirIMC = calc.calculaIMC(peso,altura);
            System.out.println(exibirIMC);
        }



    }
}
