import java.util.Scanner;

public class Leitor {
    public static void main(String[] args) {
        // sempre ultilizar dessa forma o scanner
        // existem classes que podem receber mais de um parametro mas o scanner recebe só um
        // devolve uma biblioteca do java InputStream
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        // nextline busca valores do tipo string
        String nomeUsuario = leitor.nextLine();  //capturando valor do usuario
        System.out.println(nomeUsuario);

        System.out.println("Digite sua Idade: ");
        Integer idade = leitor.nextInt();
        System.out.println(idade);

        System.out.println("Digite sua altura:");
        Double altura = leitor.nextDouble();
        System.out.println(altura);

        Scanner in = new Scanner(System.in);
        String nome = "Raquel";
        System.out.println("Digite seu nome:");
        String nomeLeitor = in.nextLine();

        System.out.println(nome .equals(nomeLeitor) );


        //erros comuns


    }
}
