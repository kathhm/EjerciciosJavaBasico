
import java.util.ArrayList;
import java.util.List;

public class Ejemplo_ColeccionesArrayList {
    public static void main (String[] args){

        //definimos una nueva lista
        List<String> pelis = new ArrayList<>();

        //agregamos elementos a nuesta lista

        pelis.add("Kiki entregas a domicilio");
        pelis.add("Crepúsculo");
        pelis.add("Mi amigo Totoro");
        pelis.add("El viaje de Chihiro");

        for(String peli : pelis){
            System.out.println("La película favorita de Kat es: "+peli);
        }

        System.out.println("Ahora probamos con un ciclo for común y corriente como tu ex, jeje");
        for(int i = 0; i < pelis.size(); i++){
            System.out.println("Una de las peliculas favoritas de Kat es: "+ (i+1) + ". " + pelis.get(i));
        }


    }
    
}
