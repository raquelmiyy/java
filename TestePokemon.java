public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Pikachu", "Elétrico", 50);
        Pokemon pokemon2 = new Pokemon("Charmander", "Fogo", 45);

        TreinadorPokemon treinador = new TreinadorPokemon("Ash");

        Integer contador = 0;
        while (contador < 5){
            treinador.treinarPokemon(pokemon1);
            contador++;
        }

        System.out.println("Pokémon 1: Nome=" + pokemon1.getNome() + ", Tipo=" + pokemon1.getTipo() + ", Força=" + pokemon1.getForca() + ", Doces=" + pokemon1.getDoces());
        pokemon1.evoluir("Raichu");
        System.out.println("Pokémon 1: Nome=" + pokemon1.getNome() + ", Tipo=" + pokemon1.getTipo() + ", Força=" + pokemon1.getForca() + ", Doces=" + pokemon1.getDoces());

        Integer contador2 = 0;
        while (contador2 < 2){
            treinador.treinarPokemon(pokemon2);
             contador2++;
        }

        System.out.println("Pokémon 2: Nome=" + pokemon2.getNome() + ", Tipo=" + pokemon2.getTipo() + ", Força=" + pokemon2.getForca() + ", Doces=" + pokemon2.getDoces());
        pokemon2.evoluir("Charizard");
        System.out.println("Treinador: Nome=" + treinador.getNome() + ", Nível=" + treinador.getNivel());
    }
}
