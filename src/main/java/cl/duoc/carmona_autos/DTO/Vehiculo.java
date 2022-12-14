package cl.duoc.carmona_autos.DTO;

public class Vehiculo {
    private String patente;
    private int seriemotor;
    private int chasis;
    private String marca;
    private String modelo;
    private String anio;
    private String tipocombustible;
    private String tipoauto;

    public Vehiculo(String patente, int seriemotor, int chasis, String marca, String modelo, String anio, String tipocombustible, String tipoauto) {
        this.patente = patente;
        this.seriemotor = seriemotor;
        this.chasis = chasis;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.tipocombustible = tipocombustible;
        this.tipoauto = tipoauto;
    }
    
    public Vehiculo() {
        this.patente = "";
        this.seriemotor = 0;
        this.chasis = 0;
        this.marca = "";
        this.modelo = "";
        this.anio = "";
        this.tipocombustible = "";
        this.tipoauto = "";
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getSeriemotor() {
        return seriemotor;
    }

    public void setSeriemotor(int seriemotor) {
        this.seriemotor = seriemotor;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public String getTipoauto() {
        return tipoauto;
    }

    public void setTipoauto(String tipoauto) {
        this.tipoauto = tipoauto;
    }
    
    @Override
    public String toString(){
        return 
                "El vehiculo " + this.patente + " Marca " 
                + this.marca + " Modelo " + this.modelo + " ha sido guardado con exito.";
    }
}
