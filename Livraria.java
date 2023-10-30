import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

public class Livraria {
    public static void main(String[] args) {
        Livro livro = new Livro();

        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConexaoDoBanco();

        Scanner leitorNumero = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        Integer opcao;
        
        Livro livroBanco = new Livro();
        Integer idInserido;
        String livroInserido;
        Double valorLivro = 0.0;

        con.execute("DROP TABLE IF EXISTS livraria");

        con.execute("""
                CREATE TABLE livraria (
                id INT PRIMARY KEY AUTO_INCREMENT,
                nome VARCHAR(255) NOT NULL,
                preco DECIMAL(10,2)
                )""");


        String menu = String.format("""
                ___________________________
                |     Livraria SPTECH     |
                |1 Cadastrar livro        |
                |2 Exibir livros          |
                |3 Atualizar livro        |
                |4 Remover livro          |
                |5 Busca trecho de nome   |
                |6 Sair                   |
                --------------------------|
                """);


        do {
            System.out.println(menu);
            opcao = leitorNumero.nextInt();

            switch (opcao) {
                case 1: System.out.println("Informe um livro");
                livroInserido = leitorTexto.nextLine();

                System.out.println("Informe o preço do livro");
                valorLivro = leitorNumero.nextDouble();

                livroBanco.setNome(livroInserido);
                livroBanco.setPreco(valorLivro);

                
                con.update("INSERT INTO livraria (nome, preco) VALUES (?, ?)", livroBanco.getNome(), livroBanco.getPreco());
                break;

                case 2:
                List<Livro> livros = con.query("SELECT * FROM livraria",
                        new BeanPropertyRowMapper<>(Livro.class));
                System.out.println(livros);
                break;

                case 3:
                System.out.println("Qual o id do livro que será atualizado");
                idInserido = leitorNumero.nextInt();
                livroBanco.setId(idInserido);

                System.out.println("Novo nome do livro");
                livroInserido = leitorTexto.next();
                livroBanco.setNome(livroInserido);

                System.out.println("Novo preço do livro");
                valorLivro = leitorNumero.nextDouble();
                livroBanco.setPreco(valorLivro);

                con.update("UPDATE livraria SET nome = ?,"
                                + "preco = ? WHERE id = ?",
                        livroBanco.getNome(), livroBanco.getPreco(), livroBanco.getId());
                System.out.println("Livro atualizado!");
                break;

                case 4:
                System.out.println("Informe o id do livro que será removido");
                idInserido = leitorNumero.nextInt();
                livroBanco.setId(idInserido);
                con.update("DELETE FROM livraria WHERE id = ?", livroBanco.getId());
                break;

                case 5:
                String livroBuscado;
                System.out.println("Qual livro deseja buscar?");
                livroBuscado = leitorTexto.next();
                livroBanco.setNome(livroBuscado);

                List<Livro> livrosPorNome = con.query("SELECT * FROM livraria WHERE nome LIKE ?",
                        new BeanPropertyRowMapper<>(Livro.class), "%%" + livroBuscado + "%%");
                    System.out.println(livrosPorNome);
                break;
            }
            }
            while (opcao != 6) ;

    }
}
