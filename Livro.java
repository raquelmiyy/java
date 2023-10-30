public class Livro {
    private Integer id;
    private String nome;
    private Double preco;

    public Livro() {}

    public Livro(Integer id, String nome, Double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return """
        Livro
        id:%s
        nome: %s
        preço: %.2f        
                """.formatted(id, nome, preco);
    }
}
