package ejercicio2;

public class compra {

    private int consecutivoCompra;
    private int fechaCompra;
    private double valorTotalIva;
    private int totalCompra;
    private producto producto;

    public compra(int consecutivoCompra, int fechaCompra, double valorTotalIva, int totalCompra, producto producto){
        this.consecutivoCompra = consecutivoCompra;
        this.fechaCompra = fechaCompra;
        this.valorTotalIva = valorTotalIva;
        this.totalCompra = totalCompra;
        this.producto=producto;
    }

    public int getConsecutivoCompra() {
        return consecutivoCompra;
    }

    public void setConsecutivoCompra(int consecutivoCompra) {
        this.consecutivoCompra = consecutivoCompra;
    }

    public int getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(int fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double  lorTotalIva() {
        return valorTotalIva;
    }

    public void setValorTotalIva(double valorTotalIva){
        this.valorTotalIva = valorTotalIva;
    }

    public int getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }

    public  producto getProducto() {
        return producto; 
    }   


    public void setProducto( producto producto) {
        this.producto = producto;
    }

}