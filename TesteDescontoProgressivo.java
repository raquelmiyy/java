import java.util.Scanner;

public class TesteDescontoProgressivo {
    public static void main(String[] args) {

        DescontoProgressivo exibir = new DescontoProgressivo();
        DescontoProgressivo calc = new DescontoProgressivo();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de desconto progressivo!");
        System.out.println("Digite o valor unitário do produto: ");
        Double valorProduto = leitor.nextDouble();
        System.out.println("Digite a quantidade: ");
        Double quantidadeProduto = leitor.nextDouble();


        Double valorComDesconto = calc.calcularDesconto(valorProduto, quantidadeProduto);
        Double notaFiscal = exibir.exibirNotaFiscal(valorProduto,quantidadeProduto,valorComDesconto);
        System.out.println(
                notaFiscal
        );



    }
}
