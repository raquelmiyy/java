public class Bolo {
    //atributos
    String sabor;
    Double valor;
    Integer quantidadeVendida;

    void comprarBolo (Integer quantidadeDesejada){

        if ((quantidadeDesejada * quantidadeVendida) > 100){
            System.out.println(String.format("Seu pedido ultrapassou nosso limite diário para esse bolo"));
        }else quantidadeVendida += quantidadeDesejada;
    }

    void exibirRelatorio (){
        Double valorTotal = valor * quantidadeVendida;
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes hoje, totalizando R$.2f",sabor,quantidadeVendida,valorTotal));
    }
}
