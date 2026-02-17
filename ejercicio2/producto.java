package ejercicio2;

public class producto {

    private tipo_producto tipoProducto;
    private int id;
    private String descripcion;
    private Double precioVenta;
    private int cantidadActual;
    private proveedor proveedor;

    public producto(int id, tipo_producto tipoProducto, String descripcion, Double precioVenta, int cantidadActual, proveedor proveedor) {

        this.id = id;
        this.tipoProducto = tipoProducto;
        this.descripcion = descripcion;
        this.precioVenta = precioVenta;
        this.cantidadActual = cantidadActual;
        this.proveedor = proveedor;
    }

    public tipo_producto getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(tipo_producto tipoProducto) {
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

    public proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(proveedor proveedor) {
        this.proveedor = proveedor;
    }
}