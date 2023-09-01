package switchcase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer opcao;
        do {
            System.out.println("""
                    Escolha uma opção:
                    1- Somar
                    2- subtrair
                    3- dividir
                    0- sair
                    """);
            opcao = in.nextInt();

            if (opcao == 1) {
                System.out.println("Você escolheu a opção 1");
            } else if (opcao == 2) {
                System.out.println("Você escolheu a opção 2");
            } else if (opcao == 3) {
                System.out.println("Você escolheu a opção 3");
            } else if (opcao == 0) {
                System.out.println("Você escolheu a opção 0");
            } else {
                System.out.println("Opção inválida");
            }

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a opção 1");
                    break;
                case 2:
                    System.out.println("Você escolheu a opção 2");
                    break;
                case 3:
                    System.out.println("Você escolheu a opção 3");
                    break;
                case 0:
                    System.out.println("Você escolheu a opção 0");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

            switch (opcao) {
                case 1 -> System.out.println("Você escolheu a opção 1");
                case 2 -> System.out.println("Você escolheu a opção 2");
                case 3 -> System.out.println("Você escolheu a opção 3");
                case 0 -> System.out.println("Você escolheu a opção 0");
                default -> System.out.println("Opção inválida");
            }

        }while(opcao!=0);
    }
}
