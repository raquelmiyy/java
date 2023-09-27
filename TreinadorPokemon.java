public class TreinadorPokemon {
        private String nome;
        private Integer nivel;

        public TreinadorPokemon(String nome) {
            this.nome = nome;
            this.nivel = 1;
        }

        public String getNome() {
        return nome;
        }

        public Integer getNivel() {
        return nivel;
        }

        public void treinarPokemon(Pokemon pokemon) {
            pokemon.ganharDoces(10);
            pokemon.aumentarForca(10);
            nivel += 2;
        }

}
