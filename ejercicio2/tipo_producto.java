package ejercicio2;

public class tipo_producto {

    private int id;
    private String descripcion;
    private double porcentajeIva;

    public tipo_producto (int id, String descripcion, double porcentajeIva){
        this.id = id;
        this.descripcion = descripcion;
        this.porcentajeIva = porcentajeIva;
    }
    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(Double porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }
}
