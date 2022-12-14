package cl.duoc.carmona_autos.Service;

import java.util.List;
import java.util.ArrayList;
import cl.duoc.carmona_autos.DTO.Arriendo;

public class Arriendoapp {
    List<Arriendo> lista = new ArrayList<>();
    
    public void Guardar(Arriendo obj){
        lista.add(obj);
    }
    
    public List<Arriendo> listar(){
        return lista;
    }
}
