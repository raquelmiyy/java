public class DescontoProgressivo {

    Double calcularDesconto(Double valorProduto, Double quantidadeProduto) {
      if (quantidadeProduto == 1) {
          return valorProduto = valorProduto * 0.90;
      } else if (quantidadeProduto == 2) {
          return valorProduto = valorProduto * 0.80;
      } else if (quantidadeProduto >= 3) {
          return valorProduto = valorProduto * 0.70;
      }
        return valorProduto;
    }

    Double exibirNotaFiscal(Double valorProduto, Double quantidadeProduto, Double valorComDesconto) {
        System.out.println("----------------------------------");
        System.out.println("valor do produto: " + valorProduto);
        System.out.println("quantidade: " + quantidadeProduto);
        System.out.println("----------------------------------");
        System.out.println("valor com desconto: " + valorComDesconto);
        return valorProduto;
    }
}
