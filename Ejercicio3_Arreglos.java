//Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas en 
//una tercera de la forma: el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.

import java.util.Scanner;

public class Ejercicio3_Arreglos {
    public static void main(String[] args) {
        int[] tablaA = new int[10];
        int[] tablaB = new int[10];
        int[] tablaMezclada = new int[20];

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese 10 números para la tabla A: ");
        for(int i = 0; i < tablaA.length; i++){
            System.out.println("Numero " + (i+1) + ":" );
            tablaA[i] = keyboard.nextInt();
        }

        System.out.println("La tabla A, es la  siguiente ");
        for(int numero : tablaA){
            System.out.print(numero);
            System.out.print(" ");
        }

        System.out.println();

        System.out.println("Ingrese 10 números para la tabla B: ");
        for(int i = 0; i < tablaB.length; i++){
            System.out.println("Numero " + (i+1) + ":" );
            tablaB[i] = keyboard.nextInt();
        }

        System.out.println("La tabla B, es la  siguiente ");
        for(int numero : tablaB){
            System.out.print(numero);
            System.out.print(" ");
        }

        System.out.println();

        int tablaMezcladaLength = tablaA.length + tablaB.length;

        System.out.println("La tabla mezclada es la siguiente");
        for(int i = 0 , j=0; i < tablaMezcladaLength; i++){
            if( i % 2 == 0 ){
                tablaMezclada[i] = tablaA[j];
            }else if( i % 2 != 0){
                tablaMezclada[i] = tablaB[j];
                j++;
            }

        }

        for(int numero : tablaMezclada){
            System.out.print(numero);
            System.out.print(" ");
        }

        
        
    }

}
