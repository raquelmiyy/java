package switchcase;

import java.util.Scanner;

public class SwitchCaseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String opcao;
        do {
            System.out.println("""
                    Escolha uma opção:
                    s - Somar
                    sub - subtrair
                    d - dividir
                    t - sair
                    """);
            opcao = in.nextLine();

            if (opcao.equals("s")) {
                System.out.println("Você escolheu a opção somar");
            } else if (opcao.equals("sub")) {
                System.out.println("Você escolheu a opção subtrair");
            } else if (opcao.equals("d")) {
                System.out.println("Você escolheu a opção dividir");
            } else if (opcao.equals("t")) {
                System.out.println("Você escolheu a opção sair");
            } else {
                System.out.println("Opção inválida");
            }

            switch (opcao) {
                case "s":
                    System.out.println("Você escolheu a opção somar");
                    break;
                case "sub":
                    System.out.println("Você escolheu a opção subtrair");
                    break;
                case "d":
                    System.out.println("Você escolheu a opção dividir");
                    break;
                case "t":
                    System.out.println("Você escolheu a opção sair");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            switch (opcao) {
                case "s" -> System.out.println("Você escolheu a opção somar");
                case "sub" -> System.out.println("Você escolheu a opção subtrair");
                case "d" -> System.out.println("Você escolheu a opção dividir");
                case "t" -> System.out.println("Você escolheu a opção sair");
                default -> System.out.println("Opção inválida");
            }

        } while (!opcao.equals("0"));
    }
}
