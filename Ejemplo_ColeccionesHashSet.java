
import java.util.HashSet;
import java.util.Set;

public class Ejemplo_ColeccionesHashSet {

    public static void main (String[] args){

        Set<String> materiasFav = new HashSet<>();

        //agregamos mis materias favoritas
        materiasFav.add("POO");
        materiasFav.add("Variable compleja");
        materiasFav.add("Sismología");
        materiasFav.add("Física experimental");

        //las imprimimos con un for each
        for(String materia : materiasFav){
            System.out.println("Una de las materias fav de Kat, es: " + materia);
        }

        /*
         * Para los Set no existen los indices
         * no se puede usar un ciclo for normal, porque no hay indices
         * se puede usar un for each
         * se puede convertir un hash set a una list, ejemplo:
         * List<String> materias = new ArrayList<>(materiasFav);
         * Su propósito es almacenar valores únicos
         */
        

    }
    
}
