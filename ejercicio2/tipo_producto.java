package ejercicio2;

public class tipo_producto {

    private int id;
    private String descripcion;
    private double porcentajeIva;

    public class tipo_producto (int id, String nombre, double porcentajeIva){
        this.id = id;
        this.descripcion = descripcion;
        this.porcentajeIva = porcentajeIva;
    }
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    
}
