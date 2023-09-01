import java.util.Scanner;

public class TesteIdade {
    public static void main(String[] args) {
        Idade classificar = new Idade();

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();

        Integer faixaEtaria = classificar.classificarIdade(idade);

    }

}
