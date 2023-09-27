public class TesteColaborador {
        public static void main(String[] args) {
            Colaborador colaborador01 = new Colaborador("João", "Estagiario Dev", 1800.0);
            Colaborador colaborador02 = new Colaborador("Maria", "Dev Junior", 3000.0);

            RecursosHumanos RH = new RecursosHumanos();

            System.out.println("Informações dos colaboradores:");
            System.out.println("Colaborador 1: Nome=" + colaborador01.getNome() + ", Cargo=" + colaborador01.getCargo() + ", Salário=" + colaborador01.getSalario());
            System.out.println("Colaborador 2: Nome=" + colaborador02.getNome() + ", Cargo=" + colaborador02.getCargo() + ", Salário=" + colaborador02.getSalario());

            RH.promover(colaborador01, "Dev Junior", 3500.0);

            RH.promover(colaborador02, "Dev Senior", 5000.0);
            RH.reajustar(colaborador02, 7000.0);

            System.out.println("Informações dos colaboradores após promoção e reajuste:");
            System.out.println("Colaborador01: Nome=" + colaborador01.getNome() + ", Cargo=" + colaborador01.getCargo() + ", Salário=" + colaborador01.getSalario());
            System.out.println("Colaborador02: Nome=" + colaborador02.getNome() + ", Cargo=" + colaborador02.getCargo() + ", Salário=" + colaborador02.getSalario());

            System.out.println("Total de promovidos: " + RH.getTotalPromovidos());
            System.out.println("Total de salários reajustados: " + RH.getTotalSalariosReajustados());
        }
    }

