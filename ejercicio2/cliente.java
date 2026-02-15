package ejercicio2;

public class cliente extends persona {

    private Double pagoProducto;

    public cliente (Double pagoProducto, int identificacion, String nombre) {
        super(identificacion,nombre);
        this.pagoProducto=pagoProducto;
    }
    
        public Double getPagoProducto () {
        return pagoProducto;
    } 
}