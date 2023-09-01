public class CalculoNutricao {

    Double calculaIMC(Double peso, Double altura){

            Double IMC = peso / (altura * altura);
           System.out.println(String.format("O IMC é: %.2f", IMC));
        return IMC;
    }


}
