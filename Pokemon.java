public class Pokemon {
        private String nome;
        private String tipo;
        private Integer forca;
        private Integer doces;

        public Pokemon(String nome, String tipo, Integer forca) {
            this.nome = nome;
            this.tipo = tipo;
            this.forca = forca;
            this.doces = 0;
        }

        public String getNome() {
            return nome;
        }

        public String getTipo() {
        return tipo;
        }
        public Integer getForca() {
        return forca;
        }

       public Integer getDoces() {
        return doces;
       }


        public void ganharDoces(Integer qtd) {
            doces += qtd;
        }

        public Boolean podeEvoluir() {
            return doces >= 50;
        }

        public void evoluir(String nomeEvolucao) {
            if (podeEvoluir()) {
                nome = nomeEvolucao;
                doces -= 50;
                System.out.println("Pokémon " + nomeEvolucao + " evoluiu para: " + nome);
            } else {
                System.out.println("Não foi possível realizar a evolução.");
            }
        }

    public void aumentarForca(Integer ignoredI) {
    }
}

