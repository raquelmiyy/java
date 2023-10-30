import java.util.Scanner;

public class TesteLanchonete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pedido pedido1 = new Pedido("Quarteirão", "refrigerante", 20.0);
        Pedido pedido2 = new Pedido("Dogão do Zé", "suco", 10.0);
        Lanchonete lanchonete = new Lanchonete("Zéc Donalds");

        Integer inputUser;
        do {
            System.out.println("""
                    Qual combo devo preparar?
                    1 > %s - %s - R$%.2f
                    2 > %s - %s - R$%.2f
                    0 > Sair
                    """.formatted(pedido1.getLanche(), pedido1.getBebida(), pedido1.getValor(),
                    pedido2.getLanche(), pedido2.getBebida(), pedido2.getValor()));
            inputUser = in.nextInt();

            switch (inputUser) {
                case 1:
                    lanchonete.prepararPedido(pedido1);
                    break;
                case 2:
                    lanchonete.prepararPedido(pedido2);
                    break;
                case 0:
                    System.out.println("Muito obrigado e volte sempre!");
                    break;
                default:
                    System.out.println("Pedido não existe!");
            }

        } while (inputUser != 0);

        lanchonete.exibirRelatorio();
    }
}
