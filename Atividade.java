package atividade;

public class Atividade {
    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        this.diasUsados = 0;
    }

    public void terminarAtividade(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    public void exibirRelatorio() {
        String texto;
        if (diasUsados > diasEstimados) {
            texto = "Você estimou %d dias, mas a tarefa foi feita em %d dias (%d dias a mais que o estimado). Melhore a estimativa."
                    .formatted(diasEstimados, diasUsados, diasUsados - diasEstimados);
        } else if (diasUsados < diasEstimados) {
            texto = "Você estimou %d dias, e a tarefa foi feita em %d dias (%d dias a menos que o estimado). Parabéns!"
                    .formatted(diasEstimados, diasUsados, diasEstimados - diasUsados);
        } else {
            texto = "Você estimou %d dias, e a tarefa foi feita em %d dias, atendendo a estimativa com precisão"
                    .formatted(diasEstimados, diasUsados);
        }

        System.out.println(texto);
    }

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }

    @Override
    public String toString() {
        return """
                nome atividade: %s
                responsavel: %s
                dias estimados: %d
                dias usados: %d
                """.formatted(nomeAtividade, responsavel, diasEstimados, diasUsados);
    }
}
