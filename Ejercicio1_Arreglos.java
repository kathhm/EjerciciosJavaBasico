
import java.util.Scanner;

//Ejercicio 1: Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo 
//orden que ingresaron.

public class Ejercicio1_Arreglos {
    public static void main(String[] args) {

        float[] numeros = new float[5];
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese 5 números: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Número " + (i + 1) + ": ");
            numeros[i] = keyboard.nextFloat();
        }

        System.out.println("Los números en el orden que los ingresó, son: " );
        for(float numero : numeros){
            System.out.println(numero);
         }
    }
}