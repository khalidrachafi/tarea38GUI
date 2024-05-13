package modelos;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.ArrayList;
import java.util.List;

public class ListaDonantes {

    private  ArrayList<Donante> listaDonantes;

    public ListaDonantes() throws IOException {
        try {
            listaDonantes = leerJSon();
        } catch (FileSystemException ex) {
            System.out.println("Error leyendo el archivo" + ex.getMessage());
        }
    }

    public ArrayList<Donante> getLista() {
        return listaDonantes;
    }

    public Donante getDonante(String id) {
        System.out.println("id buscado " + id);
        return listaDonantes.stream()
                .filter(p -> p.getIdPaciente().equals(id))
                .findFirst()
                .get();
    }

//    public static void LeerJSon() throws IOException {
//        ObjectMapper mapeador = new ObjectMapper();
//        mapeador.registerModule(new JavaTimeModule());
//
//        listaDonantes = mapeador.readValue(new File("donantes.json"),
//                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Donante.class));
//        System.out.println("---- Donantes ----");
//
//        // Leer solo los primeros 25 registros
//        List<Donante> primeros25Donantes = listaDonantes.subList(0, Math.min(25, listaDonantes.size()));
//        
//        for (Donante donante : primeros25Donantes) {
//            System.out.println(donante);
//        }
//    }
    
    
//    public List<Donante> LeerJSon() throws IOException {
//        ObjectMapper mapeador = new ObjectMapper();
//
//        listaDonantes = mapeador.readValue(new File("donantes.json"),
//                mapeador.getTypeFactory().constructCollectionType(ArrayList.class, Donante.class));
//
//        // Devolver solo los primeros 25 registros
//        return listaDonantes.subList(0, Math.min(25, listaDonantes.size()));
//    }
    
    
    
    
    public static  ArrayList<Donante> leerJSon() throws IOException{
            ObjectMapper mapeador = new ObjectMapper();
       
       
        ArrayList<Donante> catalogo = mapeador.readValue(new File("donantes.json"),
                    mapeador.getTypeFactory().
                constructCollectionType
        (ArrayList.class, Donante.class));
       
        ArrayList<Donante> devolver = new ArrayList<Donante>(catalogo.stream().limit(25).toList());
        return devolver;      
    }
    

}
