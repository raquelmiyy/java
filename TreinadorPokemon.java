package resolucao.pokemon;

public class TreinadorPokemon {

    private String nome;

    private Integer nivel;

    public TreinadorPokemon(String nome) {
        this.nome = nome;
        this.nivel = 0;
    }

    public void treinarPokemon(Pokemon pokemon) {
        pokemon.setForca(pokemon.getForca() * 1.1);
        pokemon.setDoces(pokemon.getDoces() + 10);
        nivel += 2;
    }

    public void evoluirPokemon(Pokemon pokemon, String nomeEvolucao) {
        if (pokemon.getDoces() >= 50) {
            String antigaEvolucao = pokemon.getNome();
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            nivel += 10;
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", antigaEvolucao, nomeEvolucao));
        } else {
            System.out.println("Não foi possível realizar operação");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "TreinadorPokemon{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}
