import java.util.ArrayList;
import java.util.List;  //pacote

public class ExemploLista {
    public static void main(String[] args) {
        /* lista é uma classe
        * ja tem métodos prontos
        *
        * */

        //objeto
        // new para identificar um objeto
        //instancia
        // criar listas de tipos específicos
        // métodos que mais usaremos ( add , get - retornar um elemento)
        List listaEstranha = new ArrayList();

        listaEstranha.add(21); //adiciona de maneira sequencial
        listaEstranha.add(true);
        listaEstranha.add(21.2);

//        System.out.println(listaEstranha);
          //listas no plural e variavel no singular
        List<String> nomes = new ArrayList();
        nomes.add("Raquel");
        nomes.add("Marcella");
        nomes.add("João");
        nomes.add("Melissa");
        nomes.add("Beatriz");

        System.out.println(nomes);

        //size - retorna o tamanho da lista

        String segundoNome = nomes.get(1);
        System.out.println("o segundo nome: " + segundoNome);

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + " - " + nomes.get(i));
        }

        //removendo um elemento   (o ideal é remover pelo indice)
        nomes.remove(3);
        System.out.println(nomes);

        //comparar strings .equal
        // remove - remover objeto da lista
        String nomeRemover = "Beatriz";
        for (int i = 0; i < nomes.size(); i++){
            if (nomes.get(i).equals(nomeRemover)){
                nomes.remove(i);
            }
        }
        System.out.println(nomes);


        nomes.add(0,"Denise");
        System.out.println(nomes);

        nomes.clear(); //limpa toda a lista

        // se a lista estiver vazia
        List testeIsEmpty = new ArrayList();
        if (testeIsEmpty.isEmpty()){
            System.out.println("Sem nomes na lista.");
        }



    }
}
