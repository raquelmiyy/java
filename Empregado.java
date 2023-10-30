public class Empregado {
    String nome;
    String cargo;
    Double salario;

    void reajustarSalario(Double porcentagem) {
        if (porcentagem > 0) {
            Double aumento = (porcentagem / 100) * salario;
            salario += aumento;
        }
    }
}
