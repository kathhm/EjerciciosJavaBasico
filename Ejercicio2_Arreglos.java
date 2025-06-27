
import java.util.Scanner;

// Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo y 
// a continuación realizar la media de los números positivos, la media de los negativos 
// y conteo el número de ceros.


public class Ejercicio2_Arreglos {
    public static void main(String[] args) {
        float[] numeros = new float[5];
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese 5 números: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = keyboard.nextFloat();
        }


        float sumaPositivos = 0;
        float sumaNegativos = 0;
        int conteoPositivos = 0;
        int conteoNegativos = 0;
        int conteoCeros = 0;

        for(float numero : numeros){
            if(numero > 0){
                sumaPositivos += numero;
                conteoPositivos++;
            }else if(numero < 0){
                sumaNegativos += numero;
                conteoNegativos++;
            }else if(numero == 0){
                conteoCeros++;
            }
        }

        float mediaPositivos = conteoPositivos > 0 ? sumaPositivos / conteoPositivos : 0;
        float mediaNegativos = conteoNegativos > 0 ? sumaNegativos / conteoNegativos : 0;
        System.out.println("Media de números positivos: " + mediaPositivos);
        System.out.println("Media de números negativos: " + mediaNegativos);
        System.out.println("Número de ceros: " + conteoCeros);


    }

}
