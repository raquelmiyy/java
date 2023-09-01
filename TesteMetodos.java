public class TesteMetodos {
    public static void main(String[] args) {
        String nome01 = "Raquel";
        String nome02 = "Marcella";

        Utilitaria util = new Utilitaria();
        // nova instancia

        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado(nome02);

        //chamando sobrecarga
//        util.exibirNome("teste");
        util.exibirNome("teste","guimarães");



    }
}
