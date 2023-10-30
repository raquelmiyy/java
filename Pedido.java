public class Pedido {

    // Atributos
    // Construtores
    // Metodos
    // Get Set

    private String lanche;
    private String bebida;
    private Double valor;

    public Pedido(String lanche, String bebida, Double valor) {
        this.lanche = lanche;
        this.bebida = bebida;
        this.valor = valor;
    }

    public void exibirPedido() {
        System.out.println("""
                -------------------------
                 Pedido
                -------------------------
                 Lanche: %s
                 Bebida: %s
                -------------------------
                 Total: R$ %.2f
                -------------------------
                        """.formatted(lanche, bebida, valor));
    }

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public Double getValor() {
        return valor;
    }
}
