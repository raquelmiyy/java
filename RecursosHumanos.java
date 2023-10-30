package resolucao.rh;

public class RecursosHumanos {

    private Integer totalDePromovidos;
    private Integer totalDeReajustados;

    public RecursosHumanos() {
        totalDePromovidos = 0;
        totalDeReajustados = 0;
    }

    public void reajustarSalario(Colaborador colaborador, Double reajuste) {
        totalDeReajustados++;
        colaborador.setSalario(colaborador.getSalario() + reajuste);
    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo,
                                    Double novoSalario) {
        if (novoSalario > colaborador.getSalario()) {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            totalDePromovidos++;
        } else {
            System.out.println("operação inválida");
        }
    }

    public Integer getTotalDePromovidos() {
        return totalDePromovidos;
    }

    public void setTotalDePromovidos(Integer totalDePromovidos) {
        this.totalDePromovidos = totalDePromovidos;
    }

    public Integer getTotalDeReajustados() {
        return totalDeReajustados;
    }

    public void setTotalDeReajustados(Integer totalDeReajustados) {
        this.totalDeReajustados = totalDeReajustados;
    }
}
