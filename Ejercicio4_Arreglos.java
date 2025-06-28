//Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están ordenados 
//de forma creciente, decreciente, o si están desordenados.

import java.util.Scanner;

public class Ejercicio4_Arreglos {

public static void main(String[] args) {
    int[] numeros = new int[10];
    Scanner keyboard = new Scanner(System.in);

    for(int i = 0; i<numeros.length; i++){
        System.out.println("Ingrese el número " + (i+1) + " del arreglo de números:");
        numeros[i] = keyboard.nextInt();
    }

    System.out.println("El arreglo ingresado es: ");
    for(int numero : numeros){
        System.out.print(numero + " ");
    }

    System.out.println();

    boolean creciente = true;
    boolean decreciente = true;

    for(int i = 0; i < numeros.length - 1; i++){
        if(numeros[i] < numeros[i+1]){
            decreciente = false;
        }else if (numeros[i]>numeros[i+1]){
             creciente =  false;
            }
    }

    if(creciente){
        System.out.println("El arreglo está ordenado de forma creciente");
    }else if (decreciente){
        System.out.println("El arreglo está ordenado de forma decreciente");
    }else{
        System.out.println("El arreglo está desordenado.");
    }       

    keyboard.close();

    }
}