
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ejercicio_ListSetMap {
    public static void main (String[] args){
      
        //creamos una arrayList para poner las especies que encontraron en orden
        List<String> especies = new ArrayList<>();

        //agregamos las especies
        especies.add("Homo Sapiens");
        especies.add("Mus musculus");
        especies.add("Arabidopsis");
        especies.add("Homo Sapiens");

        // imprimimos nuestra lista
        for(String especie : especies){
            System.out.println("Especie encontrada: " + especie);
        }
        
        //convertimos nuestra lista a un set para quitar los repetidos

        Set<String> especiesUnicas = new HashSet<>(especies);
        System.out.println("Las especies únicas son: ");
        for(String especieUnica: especiesUnicas){
            System.out.println(especieUnica);
        }

        //hacemos un hashMap para asociar un ID de muestra con un cientifico/a

        Map<String, String> investigador = new HashMap<>();
        investigador.put("KH1", "Katherine Hinojosa");
        investigador.put("KH2", "Canela Hinojosa");
        investigador.put("KH3", "Luis Hinojosa");
        investigador.put("KH4", "Donaldo Hinojosa");

        System.out.println("El ID de la muestra y su respectivo investigador" );
        for(Map.Entry<String,String> i : investigador.entrySet()){
            System.out.println("La muestra " + i.getKey() + " corresponde al investigador " + i.getValue() );

        }

        //Búsqueda por ID
        String IDbuscado = "KH1";

        System.out.println("El ID " + IDbuscado + " corresponde al investigador: " + investigador.get(IDbuscado) );

        


    }
    
}
