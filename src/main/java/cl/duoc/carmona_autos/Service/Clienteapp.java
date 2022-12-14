package cl.duoc.carmona_autos.Service;

import java.util.List;
import java.util.ArrayList;
import cl.duoc.carmona_autos.DTO.Cliente;

public class Clienteapp {
    List<Cliente> lista = new ArrayList<>();
    
    public void Guardar(Cliente obj){
        lista.add(obj);
    }
    
    public List<Cliente> listar(){
        return lista;
    }
}
