public class Bolo {
    //Modificador de Acesso:
    // private: somente a própria classe acessa
    // public: todo projeto acessa
    private String sabor;
    private Double valor;
    private Integer quantidadeVendida ;

    //Construtor
    public Bolo(String sabor,
                Double valor){
        this.sabor = sabor;
        this.quantidadeVendida = 0;
        this.valor = valor;
    }

//    public Bolo(String sabor, Double valor, Integer quantidadeVendida) {
//        this.sabor = sabor;
//        this.valor = valor;
//        this.quantidadeVendida = quantidadeVendida;
//    }

    //Construtor sobrecarregado
    // Se o cliente pedir para o valor ser 25.0
    // caso informe somente o sabor
    public Bolo(String sabor){
        this.sabor = sabor;
        this.quantidadeVendida = 0;
        this.valor = 25.0;
    }

    void comprarBolo(Integer quantidadeDesejada) {
        if ((quantidadeDesejada + quantidadeVendida) > 100) {
            System.out.println("Seu pedido ultrapassou \n" +
                    "nosso limite diário para esse bolo.");
        } else {
            quantidadeVendida += quantidadeDesejada;
            System.out.println("Compra realizada!");
        }
    }

    void exibirRelatorio() {
        System.out.println(
                String.format(
                        """
                                O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$ %.2f   
                                            """,
                        sabor, quantidadeVendida, (valor * quantidadeVendida)
                )
        );
    }



    //Get e Set
    //Get: pegar
    //Set: alterar
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSabor(){
        return this.sabor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

//    public void setQuantidadeVendida(Integer quantidadeVendida) {
//        this.quantidadeVendida = quantidadeVendida;
//    }
}
