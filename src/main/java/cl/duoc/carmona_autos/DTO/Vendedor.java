package cl.duoc.carmona_autos.DTO;

public class Vendedor {
    private int rut;
    private String nombre;
    private int telefono;
    private String direccion;
    private String correo;

    public Vendedor(int rut, String nombre, int telefono, String direccion, String correo) {
        this.rut = rut;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }
    
    public Vendedor() {
        this.rut = 0;
        this.nombre = "";
        this.telefono = 0;
        this.direccion = "";
        this.correo = "";
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
