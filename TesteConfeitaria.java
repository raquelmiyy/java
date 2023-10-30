public class TesteConfeitaria {
    public static void main(String[] args) {
        Bolo bolo01 = new Bolo("Chocolate",10.0);
        Bolo bolo02 = new Bolo("Morando", 35.5);
        Bolo bolo03 = new Bolo("Jaca");

        bolo01.comprarBolo(60);
        bolo01.comprarBolo(50);

        bolo01.setValor(30.0);

        bolo02.comprarBolo(30);
        bolo02.comprarBolo(30);
        bolo02.comprarBolo(30);

        String saborBolo1 = bolo01.getSabor();
        System.out.println("O bolo 1 tem o sabor: " + saborBolo1);

        bolo01.exibirRelatorio();
        bolo02.exibirRelatorio();
    }
}
