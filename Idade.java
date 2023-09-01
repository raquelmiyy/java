public class Idade {

    Integer classificarIdade(Integer idade){
        if (idade <= 2){
            System.out.println(
                    "bebê"
            );
        } else if (idade <= 11) {
            System.out.println("Criança");
        } else if (idade <= 19) {
            System.out.println("Adolescente");
        } else if (idade <= 30) {
            System.out.println("Jovem");
        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else if (idade > 60){
            System.out.println("Idoso");
        }
        return idade;
    }
}
