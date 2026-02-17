package ejercicio2;

public class producto {

    private String tipoProducto;
    private int id;
    private String descripcion;
    private Double precioVenta;
    private int cantidadActual;
    private int proveedor;
    private double porcentajeIva;

    
    public producto(int id, String tipoProducto, , String descripcion,Double precioVenta, int cantidadActual, int proveedor,double porcentajeIva) {

        this.id = id;
        this.tipoProducto = tipoProducto;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.cantidadActual = cantidadActual;
        this.proveedor = proveedor;
        this.porcentajeIva = porcentajeIva;
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

    public double getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(Double porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }
}