package cl.duoc.carmona_autos.Service;

import java.util.List;
import java.util.ArrayList;
import cl.duoc.carmona_autos.DTO.Vehiculo;

public class Vehiculoapp {
    List<Vehiculo> lista = new ArrayList<>();
    
    public void Guardar(Vehiculo obj){
        lista.add(obj);
    }
    
    public List<Vehiculo> listar(){
        return lista;
    }
    
}
