import java.util.Scanner;

public class TesteCalculoAluno {
    public static void main(String[] args) {
        CalculoAluno calc = new CalculoAluno();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        Double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota:");
        Double nota2 = leitor.nextDouble();

        Double exibirMedia = calc.calcularMedia(nota1,nota2);

        System.out.println(String.format("A média é: %s",exibirMedia));


    }
}
