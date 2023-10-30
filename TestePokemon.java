package resolucao.pokemon;

public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Paulo", "Dba", 50.);

        TreinadorPokemon treinadorPokemon = new TreinadorPokemon("William");

        treinadorPokemon.treinarPokemon(pokemon);
        treinadorPokemon.treinarPokemon(pokemon);
        treinadorPokemon.treinarPokemon(pokemon);
        treinadorPokemon.treinarPokemon(pokemon);
        treinadorPokemon.treinarPokemon(pokemon);
        treinadorPokemon.treinarPokemon(pokemon);
        treinadorPokemon.treinarPokemon(pokemon);

        treinadorPokemon.evoluirPokemon(pokemon, "Manoel");
    }
}
