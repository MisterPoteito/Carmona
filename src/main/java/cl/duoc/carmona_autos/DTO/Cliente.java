package cl.duoc.carmona_autos.DTO;


public class Cliente {
    private int rut;
    private String nombre;
    private String fechaNacimiento;
    private String direccion;
    private String correo;
    private int telefono;

    public Cliente(int rut, String nombre, String fechaNacimiento, String direccion, String correo, int telefono) {
        this.rut = rut;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }
    
    public Cliente() {
        this.rut = 0;
        this.nombre = "";
        this.fechaNacimiento = "";
        this.direccion = "";
        this.correo = "";
        this.telefono = 0;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    @Override
    public String toString(){
        return
                "Cliente " + this.nombre + " ha sido guardado con exito.";}
}
