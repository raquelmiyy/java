public class App {
    public static void main(String[] args) {

        Bolo bolo1 = new Bolo();
        bolo1.sabor = "Chocolate";
        bolo1.valor = 10.00;

        bolo1.comprarBolo(7);
        bolo1.exibirRelatorio();

//        Bolo bolo2 = new Bolo();
//        bolo2.sabor = "Chocolate";
//        bolo2.valor = 10.00;
//
//        bolo2.comprarBolo(3);
//        bolo2.exibirRelatorio();
    }
}
