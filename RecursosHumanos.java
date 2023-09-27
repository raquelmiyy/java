public class RecursosHumanos {

        private Integer totalPromovidos;
        private Integer totalSalariosReajustados;

        public void reajustar(Colaborador colaborador, Double valorReajuste) {
            double novoSalario = colaborador.getSalario() + valorReajuste;
            colaborador.setSalario(novoSalario);
            totalSalariosReajustados++;
        }

        public void promover(Colaborador colaborador, String novoCargo, Double novoSalario) {
            if (novoSalario > colaborador.getSalario()) {
                colaborador.setCargo(novoCargo);
                colaborador.setSalario(novoSalario);
                totalPromovidos++;
            } else {
                System.out.println("operação invalida");
            }
        }

        public int getTotalPromovidos() {
            return totalPromovidos;
        }

        public int getTotalSalariosReajustados() {
            return totalSalariosReajustados;
        }
    }

