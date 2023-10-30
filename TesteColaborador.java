package resolucao.rh;

public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador colaborador01 = new Colaborador("William", "Desenvolvedor", 1500.0);
        Colaborador colaborador02 = new Colaborador("Manoel", "Desenvolvedor Chefe", 10500.0);

        RecursosHumanos recursosHumanos = new RecursosHumanos();

        System.out.println(colaborador01);

        recursosHumanos.promoverColaborador(colaborador01, "Chefe do Chefe", 100000.);

        System.out.println(colaborador01.getNome());
        System.out.println(colaborador01.getSalario());
        System.out.println(colaborador01.getCargo());

        System.out.println(recursosHumanos.getTotalDePromovidos());

        System.out.println(colaborador02);

        recursosHumanos.reajustarSalario(colaborador02, 300.);

        System.out.println(colaborador02);

        System.out.println(recursosHumanos.getTotalDeReajustados());

    }
}
