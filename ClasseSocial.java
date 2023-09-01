public class ClasseSocial {

    Double calcularRenda(Double renda) {
        Double resultado = renda / 1045;
        return resultado;
    }

    String classe(Double resultado) {
        if (resultado <= 2) {
            return "E";
        } else if (resultado <=4) {
            return  "D";
        }else if (resultado <=10) {
            return  "C";
        }else if (resultado <=20) {
            return  "B";
        }else {
            return "A";
        }
    }





}
