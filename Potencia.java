public class Potencia {
    public static void main(String[] args) {
       Integer B = 2;
       Integer E = 5;
       Integer resultado = 0;

//       Double resultado = Math.pow(2,5);
        for (int i = E; i >= 1; i--){
           resultado = resultado * B;
        }

        System.out.println("resultado " + resultado);
    }
}
