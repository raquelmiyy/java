import java.util.ArrayList;
import java.util.List;

public class desafio01 {
    public static void main(String[] args) {
        List<Integer> inteiros = new ArrayList();
        inteiros.add(15);
        inteiros.add(15);
//        inteiros.add(55);
//        inteiros.add(25);
//        inteiros.add(35);
//        inteiros.add(45);

        Integer soma = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            soma = soma + inteiros.get(i);
        }
        System.out.println("soma: " + soma);
    }
}
