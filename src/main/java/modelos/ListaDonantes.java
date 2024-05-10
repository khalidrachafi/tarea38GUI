
package modelos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ListaDonantes {
    
    private ArrayList<Donante> listaDonantes;

    public ListaDonantes() {
        listaDonantes = new ArrayList<>();

    }
    
    public ArrayList<Donante> getLista(){
        return listaDonantes;
    }
    
    public Donante getDonante(String id) {
        System.out.println("id buscado " + id);
        // Habría que controlar que si el id no es valido, hay excepción
        return listaDonantes.stream().filter(p -> p.getIdPaciente().equals(id)).findFirst().get();
    }
    
    public static void LeerJSon() throws IOException {
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule());
        
        ArrayList<Donante> listaDonantes = mapeador.readValue(new File("donantes.json"),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Donante.class));
        System.out.println("---- Donantes ----");
        for (Donante listaDonante : listaDonantes) {
            System.out.println(listaDonante);
        }
        
    }
    
}
