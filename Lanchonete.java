public class Lanchonete {

    private String nome;
    private Double totalVendido;

    private Integer quantidadeDePedidosVendidos;

    public Lanchonete(String nome) {
        this.nome = nome;
        this.quantidadeDePedidosVendidos = 0;
        this.totalVendido = 0.0;
    }

    public void prepararPedido(Pedido pedido) {
        System.out.println("Preparando pedido...");

        pedido.exibirPedido();

        quantidadeDePedidosVendidos++;
        totalVendido = totalVendido + pedido.getValor();
    }

    public void exibirRelatorio() {
        System.out.println("""
                ===============================
                 Relatório %s
                ===============================
                 Quantidade de pedidos: %d
                 Total vendido: R$ %.2f
                ===============================
                        """.formatted(nome, quantidadeDePedidosVendidos, totalVendido));
    }

    public String getNome() {
        return nome;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }
}
