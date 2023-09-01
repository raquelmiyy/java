import java.util.Scanner;

public class Interpolacao {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = in.nextLine();

        System.out.println("Digite sua idade:");
        Integer idade = in.nextInt();

        System.out.println("Digite sua altura:");
        Double altura = in.nextDouble();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(altura);

//        String mensagem = String.format("Meu nome é %s \n tenho %d anos de vida \n tenho %.2f de altura",nome,idade,altura);
//        System.out.println(mensagem);


        Boolean terIphone = false;
        String tenhoIphone = "sim";
        if (terIphone) {
            tenhoIphone = "não";
        }

        String mensagem2 = String.format("""
                Meu nome é %s tenho %d anos de vida tenho %.2f de altura e """,nome,idade,altura,tenhoIphone);
                  // %% para exibir porcentagem
        System.out.println(mensagem2);



    }
}
