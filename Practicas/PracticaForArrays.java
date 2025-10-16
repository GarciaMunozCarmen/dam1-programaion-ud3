package Practicas;
public class PracticaForArrays {
    public static void mostrarTemperaturas(int[] temperaturas) {
            for(int i=0; i < temperaturas.length; i++){
                System.out.println(temperaturas[i]);
            }
    }
    public static void mostrarInverso(int[] temperatura){//Se muestra desde la última a la primera
         for(int i = 6; i > 0; i--){
                System.out.println(temperatura[i]);
            }
    }
    public static void main(String[] args) {
        int[] maxTemperaturas = {22, 23, 24, 24, 23, 21, 20};
        mostrarInverso(maxTemperaturas);
        mostrarTemperaturas(maxTemperaturas);
    }
}
