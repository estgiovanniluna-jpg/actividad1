package ejercicio2;

public class producto {

    private String tipoProducto;
    private int id;
    private String descripcion;
    private Double precioVenta;
    private int cantidadActual;
    private int proveedor;

    
    public producto(String tipoProducto, int id, String descripcion,Double precioVenta, int cantidadActual, int proveedor) {

        this.tipoProducto = tipoProducto;
        this.id = id;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.cantidadActual = cantidadActual;
        this.proveedor = proveedor;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getProveedor() {
        return proveedor;
    }

    public void setProveedor(int proveedor) {
        this.proveedor = proveedor;
    }
}