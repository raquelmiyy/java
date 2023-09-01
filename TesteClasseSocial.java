import java.util.Scanner;

public class TesteClasseSocial {
    public static void main(String[] args) {
        ClasseSocial calc = new ClasseSocial();
        ClasseSocial util = new ClasseSocial();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua renda: ");
        Double renda = leitor.nextDouble();
        Double resultadoRenda = calc.calcularRenda(renda);

        String classeSocial = util.classe(resultadoRenda);

        System.out.println(String.format("Você recebe aproximadamente %.1f salarios-minimos",resultadoRenda));
        System.out.println(String.format("Você pertence a classe social: %s ",classeSocial));



    }
}
