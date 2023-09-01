import java.util.Scanner;

public class RevisaoAc1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Double saldo = 0.0;

        Integer contador = 0;
        do {
            System.out.println("SPTech Investimentos");
            System.out.println("------------------------");
            System.out.println("Olá, o que deseja fazer:");
            System.out.println("------------------------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Simular rendimentos");
            System.out.println("0 - Sair");
            System.out.println("------------------------");
            contador = leitor.nextInt();

            if (contador.equals(1)) {
                System.out.println("Digite o valor do depósito: ");
                Double deposito = leitor.nextDouble();
                saldo += deposito;
                System.out.println(String.format("Depósito realizado - Saldo atual: R$%.2f\n", saldo));

                if (deposito <= 0) {
                    System.out.println("Valor Inválido!\n");
                }
            } else if (contador.equals(2)) {
                System.out.println("Digite o valor do saque:");
                Double saque = leitor.nextDouble();
                if (saque <= saldo) {
                    saldo -= saque;
                    System.out.println(String.format("Saque realizado - Saldo atual: R$%.2f\n",saldo));
                }else {
                    System.out.println("Valor Inválido!\n");
                }
            } else if (contador.equals(3)) {

                System.out.println(String.format("Saldo Atual: %.2f",saldo));
                Double saldoComRendimento = saldo;
                Integer mes = 1;
                while (mes <= 12){
                    saldoComRendimento = saldoComRendimento * 1.1;
                    System.out.println(String.format(" Mês %d | Saldo: %.2f |",mes,saldoComRendimento));
                    mes ++;
                }
            }

        } while (contador != 0);










    }
}
