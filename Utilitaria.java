public class Utilitaria {
    // um método tem as seguintes partes:
    // método vai sempre fazer alguma coisa
    //retorno: void(esse não possui retorno)
    //nome: exibirLinha
    // argumentos: esse não tem nenhum , sempre dentro dos parenteses (equivalente a paramentros no javascript)
    //corpo: fazer um print , sempre dentro das chaves {}

    // para ultilizar um método precisamos criar um objeto

    void exibirLinha() {
        System.out.println("*--------------------------*");
    }

    void exibirNome(String nome) {
        System.out.println("Ola " + nome);
    }

    //podemos chamar um metodo dentro de outro metodo
    //sem criar objeto
    void exibirNomeFormatado(String nome){
        exibirLinha();
        exibirNome(nome);
    }


    //metodo sobrecarregado
    /**/

    void exibirNome(String nome, String sobrenome) {
        System.out.println(String.format("Olá %s %s",nome,sobrenome));
    }


}
