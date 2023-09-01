import java.util.ArrayList;
import java.util.List;

public class desafio02 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList();

        numeros.add(15);
        numeros.add(10);
        numeros.add(2);
        numeros.add(22);
        numeros.add(33);
        System.out.println(numeros);

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0){
                numeros.remove(i);
                i--;   // quando remove um item o outro entra no lugar desse indice ai tu precisa colocar o i--;

            }
        }
        System.out.println(numeros);
    }
}
